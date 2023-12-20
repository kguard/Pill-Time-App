package com.blueguard.pilltime.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.blueguard.feature.analyze.navigation.navigateToAnalyze
import com.blueguard.feature.analyze.navigation.navigateToPill
import com.blueguard.feature.record.navigation.navigateToRecord
import com.blueguard.pilltime.feature.alarm.navigation.navigateToAlarm

/**
 * 2023-12-20
 * pureum
 */

@Composable
fun rememberPillTimeAppState(
    navController: NavHostController = rememberNavController()
): PillTimeAppState {
    return remember(navController){
        PillTimeAppState(
            navController
        )
    }
}

@Stable
class PillTimeAppState(
    val navController: NavHostController
){
    fun navigateToTopLevelDestination(name: String) {
        if(navController.currentDestination?.route != name) {
            navController.popBackStack()
            when (name) {
                "Alarm" -> navController.navigateToAlarm("Alarm")
                "Analyze" -> navController.navigateToAnalyze("Analyze")
                "Pill" -> navController.navigateToPill("Pill")
                "Record" -> navController.navigateToRecord("Record")
            }
        }
    }
}