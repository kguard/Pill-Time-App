package com.blueguard.pilltime.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.blueguard.pilltime.core.designsystem.component.MyNavigationBarItem
import com.blueguard.pilltime.core.designsystem.component.PillTimeNavigationBar
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
                checkCurrentLocation = navController.currentLocation,
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
    checkCurrentLocation: NavDestination?,
    destinations: List<Destination>
){
    PillTimeNavigationBar(
        modifier = Modifier.background(Color.Black),
    ) {
        destinations.forEach { destination ->
            val isSelected = checkCurrentLocation?.route == destination.titleTextId
            Log.e("TAG", "destination.iconTextId: ${destination.iconTextId}", )
            MyNavigationBarItem(
                isSelected = isSelected,
                icon = if(isSelected) destination.selectedIcon else destination.unSelectedIcon,
                title = destination.iconTextId,
                onClick = {
                    onNavigateToDestination(destination.titleTextId)
                }
            )
        }
    }
}
