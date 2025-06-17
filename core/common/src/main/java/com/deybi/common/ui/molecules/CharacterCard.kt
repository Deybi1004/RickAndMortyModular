package com.deybi.common.ui.molecules

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.atoms.CharacterImage
import com.deybi.common.ui.atoms.DSTextBody

@Composable
fun CharacterCard(
    name: String,
    painter: Painter,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .width(140.dp)
            .clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CharacterImage(
            painter = painter,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(1.dp))
        DSTextBody(
            text = name
        )
    }
}

@Preview(
    name = "CharacterCard Preview",
    showBackground = true,
    backgroundColor = 0xFF000000
)
@Composable
fun CharacterCardPreview() {
    val placeholderPainter = ColorPainter(Color.Gray)

    CharacterCard(
        name = "Rick Sanchez",
        painter = placeholderPainter,
        modifier = Modifier
            .padding(16.dp),
        onClick = { /* click de preview */ }
    )
}