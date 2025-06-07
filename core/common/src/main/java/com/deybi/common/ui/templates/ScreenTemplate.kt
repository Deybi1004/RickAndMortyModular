package com.deybi.common.ui.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.atoms.DSTextBody
import com.deybi.common.ui.atoms.DSTextHeading
import com.deybi.common.ui.theme.DarkGreen
import com.deybi.common.ui.theme.LightGreen

@Composable
fun ScreenTemplate(
    illustration: @Composable () -> Unit,
    title: String,
    subtitle: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            illustration()
            Spacer(modifier = Modifier.height(32.dp))
            DSTextHeading(text = title, color = DarkGreen)
            DSTextBody(text = subtitle, color = LightGreen)
            Spacer(modifier = Modifier.height(32.dp))
            content()
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun ScreenTemplatePreview() {
    ScreenTemplate(
        illustration = {
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .background(Color.LightGray)
            )
        },
        title = "WELCOME BACK",
        subtitle = "Please sign in"
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            DSTextBody(text = "Campo de ejemplo:")
            DSTextBody(text = "• Elemento 1")
            DSTextBody(text = "• Elemento 2")
        }
    }
}