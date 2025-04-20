package org.passadminh.app

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.passadminh.app.ui.screens.login.LoginScreen
import org.passadminh.app.ui.screens.registry.RegisterScreen
import org.passadminh.app.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    fun handleRegister(email: String, password: String) {
        if (email.isBlank() || password.isBlank()) {
            println("❗ Email o contraseña vacíos.")
            return
        }
        println("✅ Registrando usuario: $email con contraseña: $password")

        // navController.navigate("login") o home
    }
    AppTheme {
        LoginScreen()
        RegisterScreen(onRegister = { email, password -> handleRegister(email, password) },
            onLoginLink = {})

    }
}
