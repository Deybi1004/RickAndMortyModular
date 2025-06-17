package com.deybi.navigation.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.deybi.login.navigation.LoginRoutes
import com.deybi.login.navigation.loginGraph
import com.deybi.navigation.main.MainRoutes

fun NavGraphBuilder.authGraph(navController: NavHostController) {
    navigation(
        startDestination = LoginRoutes.LOGIN,
        route = AuthRoutes.AUTH
    ) {
        loginGraph(
            navController = navController,
            onSuccess = {
                navController.navigate(MainRoutes.MAIN) {
                    popUpTo(AuthRoutes.AUTH) { inclusive = true }
                    launchSingleTop = true
                }
            },
            onRegister = {})
    }
}
