package com.blueguard.pilltime.ui

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.blueguard.pilltime.core.designsystem.component.MyNavigationBarItem
import com.blueguard.pilltime.navigation.Destination
import com.blueguard.pilltime.navigation.PillTimeNavHost

/**
 * 2023-12-20
 * pureum
 */
@Composable
fun PillTimeApp(
    navController: PillTimeAppState = rememberPillTimeAppState()
){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomBar(
                onNavigateToDestination = navController::navigateToTopLevelDestination,
                currentLocation = navController::checkCurrentLocation,
                destinations = navController.destinations
            )
        }
    ) { padding ->
        PillTimeNavHost(
            modifier = Modifier.padding(padding),
            appState = navController
        )
    }
}

@Composable
fun BottomBar(
    onNavigateToDestination: (String) -> Unit,
    currentLocation: (String) -> Boolean,
    destinations: List<Destination>
){
    NavigationBar {
        destinations.forEach{ destination ->
            val isSelected = currentLocation(destination.iconTextId)
            Log.e("TAG", "destination.iconTextId: ${destination.iconTextId}", )
            MyNavigationBarItem(
                isSelected = isSelected,
                icon = if(isSelected) destination.selectedIcon else destination.unSelectedIcon,
                title = "Alarm",
                onClick = {
                    onNavigateToDestination("Alarm")
                }
            )
        }
    }
}