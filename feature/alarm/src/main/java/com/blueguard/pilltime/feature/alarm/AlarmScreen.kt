package com.blueguard.pilltime.feature.alarm

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.blueguard.pilltime.core.designsystem.component.MakerButton

/**
 * 2023-12-20
 * pureum
 */

@Composable
fun AlarmScreen(
    onClick: () -> Unit
){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
    ) {
        Box(
            modifier = Modifier.padding(15.dp)
        ){
            MakerButton(modifier = Modifier.align(Alignment.BottomEnd), onClick = { /*TODO*/ })
        }
    }
}

