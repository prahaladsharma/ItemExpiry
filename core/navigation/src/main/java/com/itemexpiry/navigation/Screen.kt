package com.itemexpiry.navigation

sealed class Screen(
    val route: String
) {
    data object Splash: Screen("Splash")
    data object Login: Screen("Login")
}