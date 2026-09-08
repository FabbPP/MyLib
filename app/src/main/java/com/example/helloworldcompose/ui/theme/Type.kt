package com.example.helloworldcompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.helloworldcompose.R

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font as GoogleFontBuilder

// Variable fonts: Inter for dense reading/navigation text, Manrope for titles & metrics.
val InterFontFamily = FontFamily(
    Font(R.font.inter_variable, weight = FontWeight.Normal),
    Font(R.font.inter_variable, weight = FontWeight.Medium, style = androidx.compose.ui.text.font.FontStyle.Normal),
    Font(R.font.inter_variable, weight = FontWeight.SemiBold),
    Font(R.font.inter_variable, weight = FontWeight.Bold)
)

val ManropeFontFamily = FontFamily(
    Font(R.font.manrope_variable, weight = FontWeight.Medium),
    Font(R.font.manrope_variable, weight = FontWeight.SemiBold),
    Font(R.font.manrope_variable, weight = FontWeight.Bold),
    Font(R.font.manrope_variable, weight = FontWeight.ExtraBold)
)

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontName = GoogleFont("Montserrat")

val customFontFamily = FontFamily(
    GoogleFontBuilder(googleFont = fontName, fontProvider = provider, weight = FontWeight.Normal),
    GoogleFontBuilder(googleFont = fontName, fontProvider = provider, weight = FontWeight.Bold),
    GoogleFontBuilder(googleFont = fontName, fontProvider = provider, weight = FontWeight.ExtraBold),
    GoogleFontBuilder(googleFont = fontName, fontProvider = provider, weight = FontWeight.Black)
)

private val defaultInter = TextStyle(fontFamily = InterFontFamily)

val Typography = Typography(
    displayLarge = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = (-0.32).sp
    ),
    headlineLarge = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = (-0.42).sp
    ),
    headlineMedium = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = (-0.24).sp
    ),
    headlineSmall = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = (-0.2).sp
    ),
    titleLarge = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = (-0.2).sp
    ),
    titleMedium = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = defaultInter.copy(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = defaultInter.copy(
        fontSize = 16.sp,
        lineHeight = 26.sp,
        letterSpacing = (-0.08).sp
    ),
    bodyMedium = defaultInter.copy(
        fontSize = 14.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.sp
    ),
    bodySmall = defaultInter.copy(
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.12.sp
    ),
    labelLarge = defaultInter.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.14.sp
    ),
    labelMedium = defaultInter.copy(
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.24.sp
    ),
    labelSmall = defaultInter.copy(
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.4.sp
    )
)
