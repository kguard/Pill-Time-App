package com.blueguard.feature.analyze.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.blueguard.feature.AnalyzeScreen

/**
 * 2023-12-20
 * pureum
 */

fun NavController.navigateToAnalyze(name: String){
    this.navigate(name)
}

fun NavGraphBuilder.analyzeScreen(onClick:()-> Unit){
    composable(route = "first"){
        AnalyzeScreen(onClick = {
            onClick()
        })
    }
}