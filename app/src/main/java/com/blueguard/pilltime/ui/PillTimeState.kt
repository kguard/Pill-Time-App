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
import com.blueguard.pilltime.navigation.Destination

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

    // 목적지 세 개를 리스트로 담기
    val destinations : List<Destination> = Destination.entries

    // 현 네비게이션 위치 파악
    val currentLocation = navController.currentDestination?.route ?: ""

    // selected icon 을 위한 현 위치 비교
    fun checkCurrentLocation(location: String): Boolean {
        Log.e("TAG", "checkCurrentLocation: $currentLocation", )
        Log.e("TAG", "location: $location", )
        return location == currentLocation
    }

    fun navigateToTopLevelDestination(name: String) {
        if(currentLocation != name) {
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