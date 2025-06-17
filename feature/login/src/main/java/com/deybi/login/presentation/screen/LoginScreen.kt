package com.deybi.login.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deybi.common.ui.atoms.DSButton
import com.deybi.common.ui.atoms.DSTextBody
import com.deybi.common.ui.molecules.DSInputField
import com.deybi.common.ui.molecules.DSPasswordField
import com.deybi.common.ui.templates.LoadingTemplate
import com.deybi.common.ui.templates.ScreenTemplate
import com.deybi.login.R
import com.deybi.login.presentation.state.LoginUiState

@Composable
fun LoginScreen(
    uiState: LoginUiState,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: () -> Unit,
    onRegisterClick: () -> Unit,
    onSuccess: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        when {
            uiState.isLoading -> {
                LoadingTemplate()
            }
            uiState.isSuccess -> {
                LaunchedEffect(Unit) {
                    onSuccess()
                }
            }

            else -> {
                ScreenTemplate(
                    illustration = {
                        Image(
                            painter = painterResource(R.drawable.login_image_rick_morty),
                            contentDescription = null,
                            modifier = Modifier
                                .height(200.dp)
                                .padding(top = 16.dp)
                        )
                    },
                    title = "WELCOME BACK",
                    subtitle = "SIGN IN"
                ) {
                    DSInputField(
                        value = uiState.email,
                        onValueChange = onEmailChange,
                        label = "Email or Username",
                        leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    DSPasswordField(
                        value = uiState.password,
                        onValueChange = onPasswordChange,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    DSButton(
                        text = "SIGN IN",
                        onClick = onLoginClick,
                        modifier = Modifier.padding(vertical = 16.dp),
                        containerColor = Color.Blue
                    )
                    Row(modifier = Modifier.padding(top = 8.dp)) {
                        DSTextBody(text = "Don't have an account? ")
                        Text(
                            text = "Create one Now!",
                            modifier = Modifier
                                .clickable { onRegisterClick() }
                                .padding(start = 4.dp),
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color.Green,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        uiState = LoginUiState(
            email = "test@example.com",
            password = "password123",
            isLoading = false,
            isSuccess = false,
            errorMessage = null
        ),
        onEmailChange = {},
        onPasswordChange = {},
        onLoginClick = {},
        onRegisterClick = {} ,
        onSuccess = {}
    )
}