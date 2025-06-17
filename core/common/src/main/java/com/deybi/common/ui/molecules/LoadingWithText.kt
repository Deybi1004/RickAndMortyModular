package com.deybi.common.ui.molecules

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.atoms.CircularLoader
import com.deybi.common.ui.theme.Typography

@Composable
fun LoadingWithText(
    message: String = "Cargando...",
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally) {
        CircularLoader()
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = message, style = Typography.bodyLarge)
    }
}


@Preview(
    name = "LoadingWithText Preview",
    showBackground = true,
    backgroundColor = 0xFFF0F0F0
)
@Composable
fun LoadingWithTextPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            LoadingWithText(
                message = "Cargando datos...",
                modifier = Modifier.wrapContentSize()
            )
        }
    }
}