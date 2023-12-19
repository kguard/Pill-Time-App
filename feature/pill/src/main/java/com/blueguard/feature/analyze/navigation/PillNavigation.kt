package com.blueguard.feature.analyze.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.blueguard.feature.analyze.PillScreen

/**
 * 2023-12-20
 * pureum
 */
fun NavController.navigateToPill(name: String){
    this.navigate(name)
}

fun NavGraphBuilder.pillScreen(onClick:()-> Unit){
    composable(route = "first"){
        PillScreen(onClick = {
            onClick()
        })
    }
}