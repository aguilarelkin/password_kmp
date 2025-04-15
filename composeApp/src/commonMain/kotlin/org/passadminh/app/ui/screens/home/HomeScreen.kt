package org.passadminh.app.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.passadminh.app.ui.screens.infopassword.PasswordViewModel

@Composable
fun HomeScreen(viewModel: PasswordViewModel) {
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
}
