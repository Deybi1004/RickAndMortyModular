package com.deybi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.deybi.navigation.auth.AuthRoutes
import com.deybi.navigation.auth.authGraph
import com.deybi.navigation.main.MainRoutes
import com.deybi.navigation.main.mainGraph

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = if(false) MainRoutes.MAIN else AuthRoutes.AUTH
    ) {
        authGraph(navController)
        mainGraph(navController)
    }
}
