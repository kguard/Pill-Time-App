package com.blueguard.pilltime.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRailDefaults
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.blueguard.pilltime.core.designsystem.theme.gray10
import com.blueguard.pilltime.core.designsystem.theme.gray20
import com.blueguard.pilltime.core.designsystem.theme.pink

/**
 * 2023-12-20
 * pureum
 */

@Composable
fun PillTimeNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
){
    NavigationBar(
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp, 15.dp))
            .background(Color.Transparent),
        containerColor = PillTimeNavigationDefaults.navigationContentColor(),
        content = content
    )
}

@Composable
fun RowScope.MyNavigationBarItem(
    isSelected: Boolean,
    icon: Int,
    title: String,
    onClick: () -> Unit,
) {
    NavigationBarItem(
        onClick = {onClick()},
        icon = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.size(40.dp),
//                tint = Color.White
            )
        },
//        label = {
//            Text(
//                text = title,
//                color = gray10,
//            )
//        },
        selected = isSelected,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = PillTimeNavigationDefaults.navigationSelectedItemColor(),
            unselectedIconColor = PillTimeNavigationDefaults.navigationUnSelectedItemColor(),
//            unselectedIconColor = gray10
            indicatorColor = PillTimeNavigationDefaults.navigationIndicatorColor(),
//            disabledIconColor = Color.White,
        )
    )
}

object PillTimeNavigationDefaults{
    @Composable
    fun navigationContentColor() = MaterialTheme.colorScheme.primaryContainer

    @Composable
    fun navigationSelectedItemColor() = MaterialTheme.colorScheme.primary

    @Composable
    fun navigationUnSelectedItemColor() = MaterialTheme.colorScheme.secondaryContainer

    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.primaryContainer


}


