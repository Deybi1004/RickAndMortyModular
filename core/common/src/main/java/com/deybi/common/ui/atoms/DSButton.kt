package com.deybi.common.ui.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.theme.DSShape
import com.deybi.common.ui.theme.Purple40
import com.deybi.common.ui.theme.Typography

@Composable
fun DSButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    containerColor: Color = Purple40,
    contentColor: Color = Color.White
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = DSShape.RoundedLarge,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor   = contentColor
        )
    ) {
        Text(text = text, style = Typography.labelLarge)
    }
}

@Preview(showBackground = true)
@Composable
fun DSButtonPreview() {
    Column(modifier = Modifier.padding(16.dp)) {
        DSButton(
            text = "Confirmar",
            onClick = {},
            containerColor = Purple40,
            contentColor = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        DSButton(
            text = "Eliminar",
            onClick = {},
            containerColor = Color(0xFFD32F2F),
            contentColor = Color.White
        )
    }
}