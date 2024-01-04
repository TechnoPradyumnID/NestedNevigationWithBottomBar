package com.technopradyumn.nestednevigation.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@Composable
fun StatusScreen(name: String, navController: NavHostController, onClick: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable { onClick() },
            text = "Go to $name",
            fontWeight = FontWeight.Bold
        )
    }

}

@Composable
fun ChatScreen(onClick: () -> Unit, name: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable { onClick() },
            text = "Go to $name",
            fontWeight = FontWeight.Bold
        )
    }



}

@Composable
fun SignUpScreen(navController: NavController, onLogInClick: () -> Unit, onSignUpClick: () -> Unit) {

}

@Composable
fun LoginScreen(
    navController: NavController,
    onClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable { onClick() },
            text = "LOGIN",
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.clickable { onSignUpClick() },
            text = "Sign Up",
            fontWeight = FontWeight.Medium
        )
        Text(
            modifier = Modifier.clickable { onForgotClick() },
            text = "Forgot Password",
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun ForGotPasswordScreen(
    name: String,
    function: () -> Unit
) {
    Text(text = name)
}

@Composable
fun ProfileScreen(navController: NavController, name: String, onClick: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            Button(onClick = {
                onClick()
            }) {

            }


        }
    }
}

@Composable
fun SettingsScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column {
            // Settings screen content

            // Example navigation to Logout
            Button(onClick = {

            }) {

            }
        }
    }
}

@Composable
fun SingleChatScreen(name: String, function: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable { function() },
            text = name,
            fontWeight = FontWeight.Bold
        )
    }

}

@Composable
fun SingleStatusScreen(name: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable { },
            text = name,
            fontWeight = FontWeight.Bold
        )
    }

}

@Composable
fun SettingScreen(name: String, function: () -> Unit) {

}