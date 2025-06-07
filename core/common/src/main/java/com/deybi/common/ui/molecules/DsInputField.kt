package com.deybi.common.ui.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.theme.DSShape

@Composable
fun DSInputField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        leadingIcon = leadingIcon,
        singleLine = true,
        shape = DSShape.RoundedMedium,
        modifier = modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DSInputFieldPreview_WithIcon() {
    Column(modifier = Modifier.padding(16.dp)) {
        DSInputField(
            value = "test@example.com",
            onValueChange = {},
            label = "Email",
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) }
        )

        Spacer(modifier = Modifier.height(8.dp))

        DSInputField(
            value = "",
            onValueChange = {},
            label = "Email vacío",
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) }
        )
    }
}