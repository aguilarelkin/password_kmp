package org.passadminh.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.passadminh.app.ui.screens.home.HomeScreen
import org.passadminh.app.ui.screens.login.LoginScreen
import org.passadminh.app.ui.screens.registry.RegisterScreen

@Composable
fun NavigationScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen()
        }

        composable("register") {
            RegisterScreen(onRegister = { email, pass -> println("Registrando a $email con contraseña segura... $pass") },
                onLoginLink = {
                    navController.navigate("login") {
                        popUpTo("register") {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                })
        }

        composable("home") {
            HomeScreen(viewModel = null, onLogout = {
                navController.navigate("login") {
                    popUpTo(0) {
                        inclusive = true
                    }
                    launchSingleTop = true
                }
            })
        }/*    composable("addEdit?passwordId={passwordId}", arguments = listOf(
               navArgument("passwordId") { defaultValue = "" }
           )) { backStack ->
               AddEditPasswordScreen(
                   passwordId = backStack.arguments?.getString("passwordId") ?: "",
                   onDone = { navController.popBackStack() }
               )
           }
           composable("detail/{passwordId}", arguments = listOf(
               navArgument("passwordId") { type = NavType.StringType }
           )) { backStack ->
               DetailPasswordScreen(passwordId = backStack.arguments!!.getString("passwordId")!!)
           }
           composable("settings") { SettingsScreen(onBack = { navController.popBackStack() }) }*/
    }

}