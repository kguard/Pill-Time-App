package com.blueguard.pilltime.feature.alarm.navigation

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.blueguard.pilltime.feature.alarm.AlarmScreen

/**
 * 2023-12-20
 * pureum
 */

fun NavController.navigateToAlarm(name: String){
    this.navigate(name)
}

fun NavGraphBuilder.alarmScreen(onClick:()-> Unit){
    composable(route = "Alarm"){
        AlarmScreen(onClick = {
            onClick()
        })
    }
}