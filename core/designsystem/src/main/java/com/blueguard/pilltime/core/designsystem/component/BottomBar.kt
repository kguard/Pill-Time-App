package com.blueguard.pilltime.core.designsystem.component

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * 2023-12-20
 * pureum
 */
@Composable
fun BottomBar(
    onNavigateToDestination: (String) -> Unit,
){
    NavigationBar {
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "Alarm",
            onClick = {
                onNavigateToDestination("Alarm")
            }
        )
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "Analyze",
            onClick = {
                onNavigateToDestination("Analyze")
            }
        )
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "Pill",
            onClick = {
                onNavigateToDestination("Pill")
            }
        )
        MyNavigationBarItem(
            icon = Icons.Default.AccountBox,
            text = "Record",
            onClick = {
                onNavigateToDestination("Record")
            }
        )
    }
}

@Composable
fun RowScope.MyNavigationBarItem(
    icon: ImageVector,
    text: String,
    onClick: () -> Unit,
) {
    NavigationBarItem(
        onClick = {onClick()},
        icon = {
            Icon(
                imageVector = icon,
                contentDescription = null,
            )
        },
        label = {
            Text(text)
        },
        selected = true
    )
}
