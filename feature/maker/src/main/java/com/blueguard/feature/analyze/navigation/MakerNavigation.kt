package com.blueguard.feature.analyze.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blueguard.feature.analyze.MakerScreen

/**
 * 2023-12-20
 * pureum
 */
const val makerRoute = "Maker"
fun NavController.navigateToMaker(navOptions: NavOptions){
    this.navigate(makerRoute, navOptions)
}

fun NavGraphBuilder.makerScreen(onClick:()-> Unit){
    composable(route = makerRoute){
        MakerScreen(onClick = {
            onClick()
        })
    }
}