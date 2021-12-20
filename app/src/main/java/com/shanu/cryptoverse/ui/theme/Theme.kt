package com.shanu.cryptoverse.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Yellow500,
    primaryVariant = Yellow700,
    background = DarkBackground,
    surface = DarkBackground,
    secondary = LightText

)

private val LightColorPalette = lightColors(
    primary = Yellow500,
    primaryVariant = Yellow700,
    background = LightBackground,
    surface = LightBackground,
    secondary = DarkText
)

@Composable
fun CryptoverseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if(darkTheme) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content

    )
}