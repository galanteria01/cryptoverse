package com.shanu.cryptoverse.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.shanu.cryptoverse.R

val sourceSansProFamily = FontFamily(
    Font(R.font.sourcesanspro_semibold, FontWeight.SemiBold),
    Font(R.font.sourcesanspro_regular, FontWeight.Normal),
    Font(R.font.sourcesanspro_bold, FontWeight.Bold),
    Font(R.font.sourcesanspro_light, FontWeight.Light),
    Font(R.font.sourcesanspro_extralight, FontWeight.ExtraLight),
    Font(R.font.sourcesanspro_black, FontWeight.ExtraBold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = sourceSansProFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)