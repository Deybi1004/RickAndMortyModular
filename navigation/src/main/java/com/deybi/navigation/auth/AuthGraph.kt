package com.deybi.navigation.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.deybi.login.navigation.LoginRoutes
import com.deybi.login.navigation.loginGraph

fun NavGraphBuilder.authGraph(navController: NavHostController) {
    navigation(
        startDestination = LoginRoutes.LOGIN,
        route = AuthRoutes.AUTH
    ) {
        loginGraph(navController)
    }


}
