package org.passadminh.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import password_admin.composeapp.generated.resources.JosefinSans_Bold
import password_admin.composeapp.generated.resources.Res

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {

    val JosefinSansFontFamily = FontFamily(
        Font(
            Res.font.JosefinSans_Bold
        ),
    )

    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors, typography = Typography(
            bodyMedium = MaterialTheme.typography.bodyMedium.copy(fontFamily = JosefinSansFontFamily),
            displayLarge = MaterialTheme.typography.displayLarge.copy(fontFamily = JosefinSansFontFamily),
            displayMedium = MaterialTheme.typography.displayMedium.copy(fontFamily = JosefinSansFontFamily),
            displaySmall = MaterialTheme.typography.displaySmall.copy(fontFamily = JosefinSansFontFamily),
            headlineLarge = MaterialTheme.typography.headlineLarge.copy(fontFamily = JosefinSansFontFamily),
            headlineMedium = MaterialTheme.typography.headlineMedium.copy(fontFamily = JosefinSansFontFamily),
            headlineSmall = MaterialTheme.typography.headlineSmall.copy(fontFamily = JosefinSansFontFamily),
            labelLarge = MaterialTheme.typography.labelLarge.copy(fontFamily = JosefinSansFontFamily),
            labelMedium = MaterialTheme.typography.labelMedium.copy(fontFamily = JosefinSansFontFamily),
            labelSmall = MaterialTheme.typography.labelSmall.copy(fontFamily = JosefinSansFontFamily),
            titleLarge = MaterialTheme.typography.titleLarge.copy(fontFamily = JosefinSansFontFamily),
            titleMedium = MaterialTheme.typography.titleMedium.copy(fontFamily = JosefinSansFontFamily),
            titleSmall = MaterialTheme.typography.titleSmall.copy(fontFamily = JosefinSansFontFamily),
            bodyLarge = MaterialTheme.typography.bodyLarge.copy(fontFamily = JosefinSansFontFamily),
            bodySmall = MaterialTheme.typography.bodySmall.copy(fontFamily = JosefinSansFontFamily)
        ), content = content
    )
}