package com.deybi.apprickandmortytest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.deybi.apprickandmortytest.navigation.auth.AuthRoutes
import com.deybi.apprickandmortytest.navigation.auth.authGraph
import com.deybi.apprickandmortytest.navigation.main.MainRoutes
import com.deybi.apprickandmortytest.navigation.main.mainGraph

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
