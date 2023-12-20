package com.blueguard.pilltime.feature.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

/**
 * 2023-12-20
 * pureum
 */

fun NavController.navigateToSetting(name: String){
    this.navigate(name)
}

fun NavGraphBuilder.settingScreen(onClick:()-> Unit){
    composable(route = "Setting"){
        settingScreen (onClick = {
            onClick()
        })
    }
}