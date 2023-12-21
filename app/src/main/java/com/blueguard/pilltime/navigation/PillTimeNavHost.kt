package com.blueguard.pilltime.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.blueguard.feature.record.navigation.recordScreen
import com.blueguard.pilltime.feature.alarm.navigation.alarmScreen
import com.blueguard.pilltime.ui.PillTimeAppState
import com.blueguard.pilltime.feature.setting.navigation.settingScreen

/**
 * 2023-12-20
 * pureum
 */

@Composable
fun PillTimeNavHost(
    modifier : Modifier,
    appState: PillTimeAppState,
){
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = Destination.ALARM.titleTextId,
        modifier = modifier
    ){
        alarmScreen(onClick = {
            navController.popBackStack()
            navController.navigate(Destination.ALARM.titleTextId)
        })
        recordScreen(onClick = {
            navController.popBackStack()
            navController.navigate(Destination.RECORD.titleTextId)
        })
        settingScreen(onClick = {
            navController.popBackStack()
            navController.navigate(Destination.SETTING.titleTextId)
        })
    }
}