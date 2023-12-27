package com.blueguard.pilltime.core.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blueguard.pilltime.core.designsystem.theme.PillTimeTheme
import com.blueguard.pilltime.core.model.Alarm
import com.blueguard.pilltime.core.model.Pill
import com.blueguard.pilltime.core.model.Time

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlarmCard(
    alarm: Alarm,
    modifier: Modifier = Modifier,
    onCardClick: (Alarm) -> Unit,
    onOffClick: (Boolean) -> Unit
) {
    var isOnOff by rememberSaveable { mutableStateOf(alarm.onOff) }
    Card(
        onClick = { onCardClick(alarm) },
        colors = CardDefaults.cardColors(
            containerColor = if (isOnOff) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer,
            contentColor = Color.White
        ),
        modifier = Modifier
            .padding(8.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
            .fillMaxWidth(),
//            .clickable(
//                onClick = { isClick = !isClick }
//            )
        shape = RoundedCornerShape(10),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
    ) {
        Column(modifier = modifier.padding(16.dp)) {
            Text(
                modifier = modifier.padding(top = 8.dp),
                text = alarm.alarmName,
                style = MaterialTheme.typography.bodyMedium
            )
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = modifier,
                    text = alarm.times[0].time,
                    style = MaterialTheme.typography.headlineMedium
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        modifier = modifier.padding(horizontal = 8.dp),
                        text = alarm.times.map { it.day[0] }.toString().replace("[", "")
                            .replace("]", "")
                    )
                    Switch(
                        modifier = modifier.padding(horizontal = 8.dp),
                        checked = isOnOff,
                        onCheckedChange = { newValue ->
                            isOnOff = newValue
                            onOffClick(isOnOff)
                        },
                        colors = SwitchDefaults.colors(
                            checkedBorderColor = Color.White,
                            uncheckedBorderColor = Color.Transparent,
                            uncheckedTrackColor = Color.Gray,
                            uncheckedThumbColor = Color.White
                        ),
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AlarmCardPrev() {
    PillTimeTheme {
        AlarmCard(alarm = Alarm(
            transactionId = 0,
            isAgain = false,
            alarmName = "예시",
            endType = 0,
            activeType = 0,
            onOff = false,
            times = listOf(
                Time(transactionId = 0, time = "12:30", timeId = 0, day = "수요일"),
                Time(transactionId = 0, time = "12:30", timeId = 0, day = "금요일")
            ),
            pills = listOf(Pill(transactionId = 0, pillId = 0, pillName = "알약"))
        ), onCardClick = {}, onOffClick = {})
    }
}