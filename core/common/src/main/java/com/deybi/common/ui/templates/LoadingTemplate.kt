package com.deybi.common.ui.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.molecules.LoadingWithText

@Composable
fun LoadingTemplate(
    message: String = "Cargando...",
    backgroundColor: Color = Color.White,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        LoadingWithText(message = message)
    }
}

@Preview(
    name = "LoadingTemplate Preview",
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun LoadingTemplatePreview() {
    LoadingTemplate(
        message = "Cargando datos...",
        backgroundColor = Color.White
    )
}