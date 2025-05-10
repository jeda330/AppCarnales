package com.dadevs.appcarnales.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dadevs.appcarnales.screens.LoginScreen
import com.dadevs.appcarnales.screens.MainMenuScreen
import com.dadevs.appcarnales.screens.SalesScreen
import com.dadevs.appcarnales.screens.AdminScreen
import com.dadevs.appcarnales.screens.GamificationScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main_menu" // Cambia aquí a main_menu
    ) {
        composable("login") { LoginScreen(navController) }
        composable("main_menu") { MainMenuScreen(navController) }
        composable("sales") { SalesScreen(navController) }
        composable("admin") { AdminScreen(navController) }
        composable("gamification") { GamificationScreen(navController) }
    }
}  