package com.blueguard.pilltime.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.blueguard.feature.analyze.navigation.analyzeScreen
import com.blueguard.feature.analyze.navigation.pillScreen
import com.blueguard.feature.record.navigation.recordScreen
import com.blueguard.pilltime.feature.alarm.navigation.alarmScreen
import com.blueguard.pilltime.ui.PillTimeAppState

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
        startDestination = "Alarm",
        modifier = modifier
    ){
        alarmScreen(onClick = {
            navController.popBackStack()
            navController.navigate("Alarm")
        })
        analyzeScreen(onClick = {
            navController.popBackStack()
            navController.navigate("Analyze")
        })
        pillScreen(onClick = {
            navController.popBackStack()
            navController.navigate("Pill")
        })
        recordScreen(onClick = {
            navController.popBackStack()
            navController.navigate("Record")
        })
    }
}