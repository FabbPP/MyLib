package com.example.helloworldcompose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val PrimaryTintDark = Color(0xFFBCC7DE)

// Modern Editorial Reader — Light (warm parchment-toned paper)
private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = OnPrimary,
    primaryContainer = PrimaryContainer,
    onPrimaryContainer = OnPrimaryContainer,
    inversePrimary = InversePrimary,
    primaryFixed = PrimaryFixed,
    primaryFixedDim = PrimaryFixedDim,
    onPrimaryFixed = OnPrimaryFixed,
    onPrimaryFixedVariant = OnPrimaryFixedVariant,
    secondary = Secondary,
    onSecondary = OnSecondary,
    secondaryContainer = SecondaryContainer,
    onSecondaryContainer = OnSecondaryContainer,
    secondaryFixed = SecondaryFixed,
    secondaryFixedDim = SecondaryFixedDim,
    onSecondaryFixed = OnSecondaryFixed,
    onSecondaryFixedVariant = OnSecondaryFixedVariant,
    tertiary = Tertiary,
    onTertiary = OnTertiary,
    tertiaryContainer = TertiaryContainer,
    onTertiaryContainer = OnTertiaryContainer,
    tertiaryFixed = TertiaryFixed,
    tertiaryFixedDim = TertiaryFixedDim,
    onTertiaryFixed = OnTertiaryFixed,
    onTertiaryFixedVariant = OnTertiaryFixedVariant,
    error = Error,
    onError = OnError,
    errorContainer = ErrorContainer,
    onErrorContainer = OnErrorContainer,
    background = Background,
    onBackground = OnBackground,
    surface = Surface,
    onSurface = OnSurface,
    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = OnSurfaceVariant,
    surfaceTint = SurfaceTint,
    inverseSurface = InverseSurface,
    inverseOnSurface = InverseOnSurface,
    surfaceDim = SurfaceDim,
    surfaceBright = SurfaceBright,
    surfaceContainerLowest = SurfaceContainerLowest,
    surfaceContainerLow = SurfaceContainerLow,
    surfaceContainer = SurfaceContainer,
    surfaceContainerHigh = SurfaceContainerHigh,
    surfaceContainerHighest = SurfaceContainerHighest,
    outline = Outline,
    outlineVariant = OutlineVariant
)

// Modern Editorial Reader — Dark (deep ink slate, dimmed paper)
private val DarkColorScheme = darkColorScheme(
    primary = PrimaryFixedDim,
    onPrimary = PrimaryContainer,
    primaryContainer = PrimaryContainer,
    onPrimaryContainer = OnPrimaryContainer,
    inversePrimary = Primary,
    primaryFixed = PrimaryFixed,
    primaryFixedDim = PrimaryFixedDim,
    onPrimaryFixed = OnPrimaryFixed,
    onPrimaryFixedVariant = OnPrimaryFixedVariant,
    secondary = SecondaryFixedDim,
    onSecondary = OnSecondaryFixedVariant,
    secondaryContainer = SecondaryContainer,
    onSecondaryContainer = OnSecondaryContainer,
    secondaryFixed = SecondaryFixed,
    secondaryFixedDim = SecondaryFixedDim,
    onSecondaryFixed = OnSecondaryFixed,
    onSecondaryFixedVariant = OnSecondaryFixedVariant,
    tertiary = TertiaryFixedDim,
    onTertiary = OnTertiaryFixedVariant,
    tertiaryContainer = TertiaryContainer,
    onTertiaryContainer = OnTertiaryContainer,
    tertiaryFixed = TertiaryFixed,
    tertiaryFixedDim = TertiaryFixedDim,
    onTertiaryFixed = OnTertiaryFixed,
    onTertiaryFixedVariant = OnTertiaryFixedVariant,
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF111416),
    onBackground = Color(0xFFE1E2E4),
    surface = Color(0xFF111416),
    onSurface = Color(0xFFE1E2E4),
    surfaceVariant = Color(0xFF44464C),
    onSurfaceVariant = Color(0xFFC4C6CC),
    surfaceTint = PrimaryTintDark,
    inverseSurface = Color(0xFFE1E2E4),
    inverseOnSurface = Color(0xFF2D3133),
    surfaceDim = Color(0xFF111416),
    surfaceBright = Color(0xFF363A3C),
    surfaceContainerLowest = Color(0xFF0C0E10),
    surfaceContainerLow = Color(0xFF191C1E),
    surfaceContainer = Color(0xFF1D2022),
    surfaceContainerHigh = Color(0xFF282A2D),
    surfaceContainerHighest = Color(0xFF333537),
    outline = Color(0xFF8E9096),
    outlineVariant = Color(0xFF44464C)
)

@Composable
fun HelloWorldComposeTheme(
    darkTheme: Boolean = androidx.compose.foundation.isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
