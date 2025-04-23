package org.passadminh.app.ui.screens.login

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.brands.Google
import compose.icons.fontawesomeicons.regular.Eye
import compose.icons.fontawesomeicons.regular.EyeSlash
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun LoginScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF2196F3), Color(0xFF00BCD4)),
                    startY = 0f,
                    endY = size.height * 0.5f
                )
            )
            val wavePath = Path().apply {
                val amplitude = size.height * 0.05f
                moveTo(0f, size.height * 0.6f)
                cubicTo(
                    size.width * 0.25f,
                    size.height * 0.55f - amplitude,
                    size.width * 0.75f,
                    size.height * 0.65f + amplitude,
                    size.width,
                    size.height * 0.6f
                )
                lineTo(size.width, size.height)
                lineTo(0f, size.height)
                close()
            }
            drawPath(wavePath, Color.White)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp)
                .align(Alignment.TopCenter).padding(top = 80.dp)
        ) {
            Text("Login", fontSize = 32.sp, color = Color.White)

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
                modifier = Modifier.fillMaxWidth().height(56.dp)
            )

            Spacer(Modifier.height(16.dp))

            var password by remember { mutableStateOf("") }
            var visible by remember { mutableStateOf(false) }
            TextField(value = password,
                onValueChange = { password = it },
                placeholder = { Text("Password") },
                singleLine = true,
                visualTransformation = if (visible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    Icon(imageVector = if (visible) FontAwesomeIcons.Regular.Eye else FontAwesomeIcons.Regular.EyeSlash,
                        contentDescription = "Toggle",
                        modifier = Modifier.size(24.dp).clickable { visible = !visible })
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(50),
                modifier = Modifier.fillMaxWidth().height(56.dp)
            )

            Spacer(Modifier.height(24.dp))
            Button(
                onClick = { /* TODO: login action */ },
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
                    Text("Login", color = Color.White, fontSize = 18.sp)
                }
            }

            Spacer(Modifier.height(8.dp))

            Text("Forgot your password?",
                color = Color.Gray.copy(alpha = 0.8f),
                fontSize = 14.sp,
                modifier = Modifier.clickable { /* TODO: forgot pass */ })
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter).padding(bottom = 32.dp)
        ) {

            //
            // Text("Need an account?", fontSize = 14.sp, color = Color.Gray)

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                SocialIcon(imageVector = FontAwesomeIcons.Brands.Google, contentDesc = "Google")/*  SocialIcon(imageVector = FontAwesomeIcons.Brands.Facebook, contentDesc = "Facebook")
                SocialIcon(imageVector = FontAwesomeIcons.Brands.Twitter, contentDesc = "Twitter")*/
            }
            Spacer(Modifier.height(24.dp))
            Button(
                onClick = { navController.navigate("register") },
                colors = ButtonDefaults.buttonColors(Color(0xFF7C4DFF)),
                shape = RoundedCornerShape(50),
                modifier = Modifier.height(FiftySixDp).width(200.dp)
            ) {
                Text("Sign Up", color = Color.White)
            }
        }
    }
}


@Composable
fun SocialIcon(imageVector: ImageVector, contentDesc: String) {
    IconButton(onClick = { /* TODO: social login */ }) {
        Icon(
            tint = Color(0xFF4285F4),
            imageVector = imageVector,
            contentDescription = contentDesc,
            modifier = Modifier.size(36.dp)
        )
    }
}

private val FiftySixDp: Dp = 56.dp

