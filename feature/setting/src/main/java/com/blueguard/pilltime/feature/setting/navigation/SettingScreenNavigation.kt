package com.blueguard.pilltime.feature.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blueguard.pilltime.feature.setting.SettingScreen

/**
 * 2023-12-20
 * pureum
 */
const val settingRoute = "Setting"
fun NavController.navigateToSetting(navOptions: NavOptions){
    this.navigate(settingRoute, navOptions)
}

fun NavGraphBuilder.settingScreen(onClick:()-> Unit){
    composable(route = settingRoute){
        SettingScreen (onClick = {
            onClick()
        })
    }
}