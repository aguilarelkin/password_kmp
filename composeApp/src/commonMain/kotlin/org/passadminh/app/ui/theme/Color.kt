package org.passadminh.app.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val PrimaryColor = Color(0xFF0A84FF)
val OnPrimaryColor = Color(0xFFFFFFFF)
val SecondaryColor = Color(0xFF5AC8FA)
val OnSecondaryColor = Color(0xFF000000)
val BackgroundColor = Color(0xFF121212)
val OnBackgroundColor = Color(0xFFE0E0E0)
val SurfaceColor = Color(0xFF1E1E1E)
val OnSurfaceColor = Color(0xFFE0E0E0)
val ErrorColor = Color(0xFFCF6679)
val OnErrorColor = Color(0xFF000000)

val DarkColors = darkColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    secondary = SecondaryColor,
    onSecondary = OnSecondaryColor,
    background = BackgroundColor,
    onBackground = OnBackgroundColor,
    surface = SurfaceColor,
    onSurface = OnSurfaceColor,
    error = ErrorColor,
    onError = OnErrorColor
)

val LightColors = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimaryColor,
    secondary = SecondaryColor,
    onSecondary = OnSecondaryColor,
    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF000000),
    surface = Color(0xFFF5F5F5),
    onSurface = Color(0xFF000000),
    error = Color(0xFFB00020),
    onError = Color(0xFFFFFFFF)
)
