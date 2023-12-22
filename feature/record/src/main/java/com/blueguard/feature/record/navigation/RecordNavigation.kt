package com.blueguard.feature.record.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blueguard.feature.record.RecordScreen

/**
 * 2023-12-20
 * pureum
 */
const val recordRoute = "Record"
fun NavController.navigateToRecord(navOptions: NavOptions){
    this.navigate(recordRoute, navOptions)
}

fun NavGraphBuilder.recordScreen(onClick:()-> Unit){
    composable(route = recordRoute){
        RecordScreen(onClick = {
            onClick()
        })
    }
}