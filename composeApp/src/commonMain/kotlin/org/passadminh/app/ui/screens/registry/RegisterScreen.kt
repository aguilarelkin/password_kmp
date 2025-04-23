package org.passadminh.app.ui.screens.registry

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.regular.Eye
import compose.icons.fontawesomeicons.regular.EyeSlash

@Composable
fun RegisterScreen(
    onRegister: (email: String, pass: String) -> Unit,
    onLoginLink: () -> Unit,
    navController: NavHostController
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF2196F3), Color(0xFF00BCD4)),
                    startY = 0f,
                    endY = size.height * 0.5f
                )
            )
            val wave = Path().apply {
                val amp = size.height * 0.05f
                moveTo(0f, size.height * 0.6f)
                cubicTo(
                    size.width * 0.25f,
                    size.height * 0.55f - amp,
                    size.width * 0.75f,
                    size.height * 0.65f + amp,
                    size.width,
                    size.height * 0.6f
                )
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                close()
            }
            drawPath(wave, Color.White)
        }
        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier.padding(16.dp).align(Alignment.TopStart)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Atrás",
                tint = Color.White
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp)
                .align(Alignment.TopCenter).padding(top = 80.dp)
        ) {
            Text("Register", fontSize = 32.sp, color = Color.White)
            Spacer(Modifier.height(32.dp))

            var email by remember { mutableStateOf("") }
            TextField(value = email,
                onValueChange = { email = it },
                placeholder = { Text("yourmail00@gmail.com") },
                singleLine = true,
                trailingIcon = {
                    if (email.isNotBlank()) Icon(
                        Icons.Default.CheckCircle, contentDescription = "Valid", tint = Color.Green
                    )
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(50),
                modifier = Modifier.fillMaxWidth().height(FiftySixDp)
            )

            Spacer(Modifier.height(16.dp))

            var password by remember { mutableStateOf("") }
            var passVisible by remember { mutableStateOf(false) }
            TextField(value = password,
                onValueChange = { password = it },
                placeholder = { Text("Password") },
                singleLine = true,
                visualTransformation = if (passVisible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    Icon(imageVector = if (passVisible) FontAwesomeIcons.Regular.Eye else FontAwesomeIcons.Regular.EyeSlash,
                        contentDescription = "Toggle",
                        modifier = Modifier.size(24.dp).clickable { passVisible = !passVisible })
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(50),
                modifier = Modifier.fillMaxWidth().height(FiftySixDp)
            )

            Spacer(Modifier.height(16.dp))

            var confirm by remember { mutableStateOf("") }
            var confirmVisible by remember { mutableStateOf(false) }
            TextField(value = confirm,
                onValueChange = { confirm = it },
                placeholder = { Text("Confirm Password") },
                singleLine = true,
                visualTransformation = if (confirmVisible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    Icon(imageVector = if (confirmVisible) FontAwesomeIcons.Regular.Eye else FontAwesomeIcons.Regular.EyeSlash,
                        contentDescription = "Toggle",
                        modifier = Modifier.size(24.dp)
                            .clickable { confirmVisible = !confirmVisible })
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(50),
                modifier = Modifier.fillMaxWidth().height(FiftySixDp)
            )

            Spacer(Modifier.height(24.dp))

            Button(
                onClick = {
                    if (password == confirm && email.isNotBlank()) {
                        onRegister(email, password)
                    } else {
                        // Aquí podrías mostrar un snackbar o diálogo corporativo
                    }
                },
                contentPadding = PaddingValues(),
                shape = RoundedCornerShape(50),
                modifier = Modifier.fillMaxWidth().height(FiftySixDp)
            ) {
                Box(
                    modifier = Modifier.background(
                        Brush.horizontalGradient(
                            colors = listOf(Color(0xFF7C4DFF), Color(0xFF651FFF))
                        ), shape = RoundedCornerShape(50)
                    ).fillMaxSize(), contentAlignment = Alignment.Center
                ) {
                    Text("Register", color = Color.White, fontSize = 18.sp)
                }
            }

            Spacer(Modifier.height(16.dp))

            Text("Already have an account? Login",
                color = Color.White.copy(alpha = 0.8f),
                fontSize = 14.sp,
                modifier = Modifier.clickable { onLoginLink() })
        }
    }
}

private val FiftySixDp: Dp = 56.dp
