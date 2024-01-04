package com.example.nestednavigationbottombardemo.graphs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigationbottombardemo.graphs.AuthScreen.*
import com.technopradyumn.nestednevigation.BottomBarScreen
import com.technopradyumn.nestednevigation.navigation.ChatScreen
import com.technopradyumn.nestednevigation.navigation.LoginScreen
import com.technopradyumn.nestednevigation.navigation.ProfileScreen
import com.technopradyumn.nestednevigation.navigation.SettingScreen
import com.technopradyumn.nestednevigation.navigation.SingleChatScreen
import com.technopradyumn.nestednevigation.navigation.SingleStatusScreen
import com.technopradyumn.nestednevigation.navigation.StatusScreen

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.ChatList.route
    ) {
        composable(route = BottomBarScreen.ChatList.route) {
            ChatScreen(
                name = BottomBarScreen.ChatList.route,
                onClick = {
                    navController.navigate(ChatSc.SingleChat.route)
                }
            )
        }

        composable(route = BottomBarScreen.Status.route) {
            StatusScreen(
                navController = navController,
                name = BottomBarScreen.Status.route,
                onClick = {
                    navController.navigate(StatusSc.SingleStatus.route)
                }
            )
        }

        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen(
                navController = navController,
                name = BottomBarScreen.Profile.route,
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.AUTHENTICATION) {
                        popUpTo(Graph.HOME) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        chatListNavGraph(navController = navController)
        statusNavGraph(navController = navController)
        profileNavGraph(navController = navController)

        authNavGraph(navController = navController)

    }
}

fun NavGraphBuilder.chatListNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.CHAT,
        startDestination = ChatSc.SingleChat.route
    ) {
        composable(route = ChatSc.SingleChat.route) {
            SingleChatScreen(
                name = ChatSc.SingleChat.route,
                function = {

                }

            )
        }

        composable(route = ChatSc.Overview.route) {
            SingleStatusScreen(name = ChatSc.Overview.route)
        }
    }
}

fun NavGraphBuilder.statusNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.STATUS,
        startDestination = StatusSc.SingleStatus.route
    ) {
        composable(route = StatusSc.SingleStatus.route) {
            SingleStatusScreen(name = StatusSc.SingleStatus.route)
        }
    }
}

fun NavGraphBuilder.profileNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.PROFILE,
        startDestination = ProfileSc.Setting.route
    ) {
        composable(route = ProfileSc.Setting.route) {
            SettingScreen(
                name = ProfileSc.Setting.route,
                function = {

                }
            )
        }



    }
}


sealed class ChatSc(val route: String) {
    object SingleChat : ChatSc(route = "SINGLECHAT")
    object Overview : ChatSc(route = "OVERVIEW")
}

sealed class StatusSc(val route: String) {
    object SingleStatus : StatusSc(route = "SINGLESTATUS")
}

sealed class ProfileSc(val route: String) {
    object Setting : ProfileSc(route = "Setting")
}
