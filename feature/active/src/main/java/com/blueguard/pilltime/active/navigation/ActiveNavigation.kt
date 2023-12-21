package com.blueguard.pilltime.active.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blueguard.pilltime.active.ActiveScreen

/**
 * 2023-12-20
 * pureum
 */

const val activeRoute = "Active"
fun NavController.navigateToActive(navOptions: NavOptions){
    this.navigate(activeRoute, navOptions)
}

fun NavGraphBuilder.activeScreen(onClick:()-> Unit){
    composable(route = activeRoute){
        ActiveScreen()
    }
}