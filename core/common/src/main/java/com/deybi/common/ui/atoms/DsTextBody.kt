package com.deybi.common.ui.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.deybi.common.ui.theme.Typography

@Composable
fun DSTextBody(text: String, color: Color = Color.Black, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = Typography.bodyMedium,
        color = color,
        modifier = modifier
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DSTextBodyPreview() {
    DSTextBody(text = "Este es un texto de ejemplo para DSTextBody")
}