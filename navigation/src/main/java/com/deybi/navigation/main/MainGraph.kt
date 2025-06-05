package com.deybi.navigation.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.deybi.home.navigation.HomeRoutes
import com.deybi.home.navigation.homeGraph

fun NavGraphBuilder.mainGraph(navController: NavHostController){
    navigation(
        startDestination = HomeRoutes.HOME,
        route = MainRoutes.MAIN
    ) {
        homeGraph(navController)
    }
}