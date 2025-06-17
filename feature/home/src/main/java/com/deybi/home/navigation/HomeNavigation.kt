package com.deybi.home.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.deybi.home.R
import com.deybi.home.presentation.model.CharacterUiItem
import com.deybi.home.presentation.screen.HomeScreen

fun NavGraphBuilder.homeGraph(navController: NavHostController) {

    composable(HomeRoutes.HOME) {
        val rickIcon = painterResource(id = R.drawable.rick_morty)
        val mortyIcon = painterResource(id = R.drawable.rick_morty)

        val sampleCharacters = remember {
            listOf(
                CharacterUiItem(
                    id = "1",
                    name = "Rick",
                    icon = rickIcon
                ),
                CharacterUiItem(
                    id = "2",
                    name = "Morty",
                    icon = mortyIcon
                ),
                CharacterUiItem(
                    id = "3",
                    name = "Rick",
                    icon = rickIcon
                ),
                CharacterUiItem(
                    id = "4",
                    name = "Morty",
                    icon = mortyIcon
                ),
                CharacterUiItem(
                    id = "5",
                    name = "Rick",
                    icon = rickIcon
                ),
                CharacterUiItem(
                    id = "24",
                    name = "Morty",
                    icon = mortyIcon
                ),
                CharacterUiItem(
                    id = "11",
                    name = "Rick",
                    icon = rickIcon
                ),
                CharacterUiItem(
                    id = "25",
                    name = "Morty",
                    icon = mortyIcon
                )
            )
        }
        HomeScreen(
            characters = sampleCharacters,
            onMenuClick = {
                navController.navigate("settings")
            },
            onCharacterClick = { name ->
                navController.navigate("detail/$name")
            }
        )
    }
}