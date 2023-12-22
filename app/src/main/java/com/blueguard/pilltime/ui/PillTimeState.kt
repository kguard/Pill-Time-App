package com.blueguard.pilltime.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.blueguard.feature.record.navigation.navigateToRecord
import com.blueguard.pilltime.feature.alarm.navigation.navigateToAlarm
import com.blueguard.pilltime.feature.setting.navigation.navigateToSetting
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
    val currentLocation: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    // selected icon 을 위한 현 위치 비교
    fun checkCurrentLocation(location: String): Boolean {
        return location == (navController.currentDestination?.route ?: "")
    }

    fun navigateToTopLevelDestination(name: String) {
        Log.e("TAG", "navigateToTopLevelDestination: $name", )
        Log.e("TAG", "currentLocation: ${navController.currentDestination?.route ?: ""}")

        val navOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true

            restoreState = true
        }
        when (name) {
            Destination.ALARM.titleTextId -> navController.navigateToAlarm(navOptions)
            Destination.RECORD.titleTextId -> navController.navigateToRecord(navOptions)
            Destination.SETTING.titleTextId-> navController.navigateToSetting(navOptions)
        }
    }
}