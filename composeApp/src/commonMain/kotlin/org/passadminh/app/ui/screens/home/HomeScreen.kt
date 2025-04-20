package org.passadminh.app.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.passadminh.app.ui.screens.infopassword.PasswordViewModel

@Composable
fun HomeScreen(viewModel: PasswordViewModel, onLogout: () -> Unit) {
/*    val state by viewModel.state.collectAsState()

    Column(Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
        Text("Tus contraseñas", style = MaterialTheme.typography.titleLarge)
        // Mostrar lista o errores
        if (state.isLoading) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(state.passwords) { password ->
                    Text(password.title)
                }
            }
        }
    }*/
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Pantalla principal", style = MaterialTheme.typography.h3)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onLogout) {
                Text("Cerrar sesión")
            }
        }
    }
}
