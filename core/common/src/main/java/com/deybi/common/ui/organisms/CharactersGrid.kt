package com.deybi.common.ui.organisms

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.molecules.CharacterCard

@Composable
fun CharactersGrid(
    characters: List<Pair<String, Painter>>,
    modifier: Modifier = Modifier,
    onItemClick: (String) -> Unit = {}
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        items(characters) { (name, painter) ->
            CharacterCard(
                name = name,
                painter = painter,
                onClick = { onItemClick(name) }
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(
    name = "CharactersGrid Preview",
    showBackground = true,
    backgroundColor = 0xFF000000
)
@Composable
fun CharactersGridPreview() {
    val placeholder = ColorPainter(Color.Gray)
    val characters = List(6) { index ->
        "Character #${index + 1}" to placeholder
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        CharactersGrid(
            characters = characters,
            modifier = Modifier.fillMaxSize(),
            onItemClick = { /* click en preview */ }
        )
    }
}