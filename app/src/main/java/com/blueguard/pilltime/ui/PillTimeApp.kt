package com.blueguard.pilltime.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.blueguard.pilltime.core.designsystem.component.BottomBar
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
            BottomBar(onNavigateToDestination = navController::navigateToTopLevelDestination)
        }
    ) { padding ->
        PillTimeNavHost(
            modifier = Modifier.padding(padding),
            appState = navController
        )
    }
}