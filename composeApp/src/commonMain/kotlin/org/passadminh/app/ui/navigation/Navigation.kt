package org.passadminh.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun NavigationScreen(navController: NavController){
   /* NavHost(navController, startDestination = "login") {
        composable("login") { LoginScreen(onLoginSuccess = { navController.navigate("home") }) }
        composable("register") { RegisterScreen(onRegistered = { navController.popBackStack() }) }
        composable("home") { HomeScreen(
            onAdd = { navController.navigate("addEdit") },
            onDetail = { id -> navController.navigate("detail/$id") },
            onSettings = { navController.navigate("settings") }
        )
        }
        composable("addEdit?passwordId={passwordId}", arguments = listOf(
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
        composable("settings") { SettingsScreen(onBack = { navController.popBackStack() }) }
    }*/

}