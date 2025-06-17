package com.deybi.common.ui.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun CharacterImage(
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painter,
        contentDescription = null,
        modifier = modifier
            .aspectRatio(1f)
            .clip(RoundedCornerShape(12.dp))
    )
}