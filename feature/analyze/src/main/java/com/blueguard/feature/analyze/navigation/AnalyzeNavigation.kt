package com.blueguard.feature.analyze.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blueguard.feature.AnalyzeScreen

/**
 * 2023-12-20
 * pureum
 */
const val alarmRoute = "Analyze"
fun NavController.navigateToAnalyze(name: NavOptions){
    this.navigate(alarmRoute, name)
}

fun NavGraphBuilder.analyzeScreen(onClick:()-> Unit){
    composable(route = alarmRoute){
        AnalyzeScreen(onClick = {
            onClick()
        })
    }
}