package com.technopradyumn.nestednevigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.WebStories
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object ChatList : BottomBarScreen(
        route = "CHAT",
        title = "Chat",
        icon = Icons.Default.Chat
    )

    object Status : BottomBarScreen(
        route = "STATUS",
        title = "Status",
        icon = Icons.Default.WebStories
    )

    object Profile : BottomBarScreen(
        route = "PROFILE",
        title = "Profile",
        icon = Icons.Default.Person
    )
}
