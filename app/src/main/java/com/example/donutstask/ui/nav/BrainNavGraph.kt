package com.example.donutstask.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.donutstask.ui.screens.SingleDonut
import com.example.donutstask.ui.screens.WelcomeScreen


@Composable
fun BrainNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BrainDestination.Welcome) {

        composable(BrainDestination.Welcome) { WelcomeScreen(navController) }

        homeScreen(navController)
        single(navController)

    }
}

object BrainDestination {
    const val Welcome = "welcomeScreen"
    const val Home = "homeScreen"
    const val SingleDonut = "SingleDonut"
}