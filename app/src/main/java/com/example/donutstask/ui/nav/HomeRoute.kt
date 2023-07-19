package com.example.donutstask.ui.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.donutstask.ui.screens.Home
import com.example.donutstask.ui.screens.SingleDonut

private const val ROUTE = BrainDestination.Home
private const val ROUTE2 = BrainDestination.SingleDonut


fun NavController.navigateToHomeScreen() {
    navigate(ROUTE)
}
fun NavController.navigateToSingleDonut() {
    navigate(ROUTE2)
}



fun NavGraphBuilder.homeScreen(navController: NavHostController) {
    composable(ROUTE) { Home(navController) }
}fun NavGraphBuilder.single(navController: NavHostController) {
    composable(ROUTE2) { SingleDonut(navController) }
}
fun NavController.back() {
    popBackStack()
}


