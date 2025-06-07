package com.deybi.common.ui.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DSPasswordField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    DSInputField(
        value = value,
        onValueChange = onValueChange,
        label = "Password",
        leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
        modifier = modifier
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DSPasswordFieldPreview_Empty() {
    Column(modifier = Modifier.padding(16.dp)) {
        DSPasswordField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}