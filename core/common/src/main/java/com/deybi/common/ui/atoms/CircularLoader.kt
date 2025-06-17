package com.deybi.common.ui.atoms

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.theme.DarkGreen

@Composable
fun CircularLoader(
    modifier: Modifier = Modifier,
    color: Color = DarkGreen,
    strokeWidth: Dp = 4.dp,
    size: Dp = 48.dp
) {
    CircularProgressIndicator(
        color = color,
        strokeWidth = strokeWidth,
        modifier = modifier.size(size)
    )
}

@Preview(
    name = "CircularLoader Preview",
    showBackground = true,
    backgroundColor = 0xFFF0F0F0
)
@Composable
fun CircularLoaderPreview() {
    MaterialTheme {
        CircularLoader(
            color = Color(0xFF2E7D32),
            strokeWidth = 4.dp,
            size = 48.dp
        )
    }
}