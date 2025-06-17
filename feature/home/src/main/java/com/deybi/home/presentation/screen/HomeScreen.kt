package com.deybi.home.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.atoms.DSTextHeading
import com.deybi.common.ui.atoms.HamburgerIcon
import com.deybi.common.ui.molecules.CharacterCard
import com.deybi.common.ui.organisms.CharactersGrid
import com.deybi.home.presentation.model.CharacterUiItem

@Composable
fun HomeScreen(
    characters: List<CharacterUiItem>,
    onMenuClick: () -> Unit,
    onCharacterClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                DSTextHeading(
                    text = "Characters",
                    modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally)
                )
                HamburgerIcon(onClick = onMenuClick)
            }
        },
        containerColor = Color.White
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(characters, key = { it.id }) { character ->
                CharacterCard(
                    name = character.name,
                    painter = character.icon,
                    onClick = { onCharacterClick(character.name) }
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 640
)
@Composable
fun HomeScreenPreview() {
    // Datos de ejemplo
    val sampleCharacters = listOf(
        CharacterUiItem(
            id = "1",
            name = "Rick",
            icon = painterResource(id = com.deybi.home.R.drawable.rick_morty)
        ),
        CharacterUiItem(
            id = "2",
            name = "Morty",
            icon = painterResource(id = com.deybi.home.R.drawable.rick_morty)
        ),
        CharacterUiItem(
            id = "3",
            name = "Birdperson",
            icon = painterResource(id = com.deybi.home.R.drawable.rick_morty)
        ),
        CharacterUiItem(
            id = "4",
            name = "Summer",
            icon = painterResource(id = com.deybi.home.R.drawable.rick_morty)
        )
    )

    HomeScreen(
        characters = sampleCharacters,
        onMenuClick = { /* nada */ },
        onCharacterClick = { /* nada */ }
    )
}
