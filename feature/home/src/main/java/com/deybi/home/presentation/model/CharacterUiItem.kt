package com.deybi.home.presentation.model

import androidx.compose.ui.graphics.painter.Painter

data class CharacterUiItem(
    val id: String,
    val name: String,
    val icon: Painter
)