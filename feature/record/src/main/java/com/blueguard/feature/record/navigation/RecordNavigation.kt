package com.blueguard.feature.record.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.blueguard.feature.record.RecordScreen

/**
 * 2023-12-20
 * pureum
 */

fun NavController.navigateToRecord(name: String){
    this.navigate(name)
}

fun NavGraphBuilder.recordScreen(onClick:()-> Unit){
    composable(route = "first"){
        RecordScreen(onClick = {
            onClick()
        })
    }
}