package org.passadminh.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.passadminh.app.ui.navigation.NavigationScreen
import org.passadminh.app.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    AppTheme {
        NavigationScreen(navController)
    }
}
