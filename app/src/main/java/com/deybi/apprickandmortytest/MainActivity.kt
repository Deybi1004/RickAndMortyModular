package com.deybi.apprickandmortytest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.deybi.common.ui.theme.AppRickAndMortyTestTheme
import com.deybi.navigation.AppNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppRickAndMortyTestTheme {
               val navController = rememberNavController()
                AppNavHost(navController)
            }
        }
    }
}
