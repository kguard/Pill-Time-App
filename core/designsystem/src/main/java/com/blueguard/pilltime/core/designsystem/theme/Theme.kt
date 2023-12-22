package com.blueguard.pilltime.core.designsystem.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val colorScheme = lightColorScheme(
    primary = pink,
    onPrimary = Color.White,
    primaryContainer = gray10,
    onPrimaryContainer = Color.White,
    secondary = green,
    onSecondary = Color.White,
    secondaryContainer = gray20,
    onSecondaryContainer = Color.White,
    tertiary = blue,
    onTertiary = Color.White,
    surface = blueBlack,
    onSurface = Color.White,
    error = red,
    onError = Color.White
)

@Composable
fun PillTimeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = colorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primaryContainer.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )

}