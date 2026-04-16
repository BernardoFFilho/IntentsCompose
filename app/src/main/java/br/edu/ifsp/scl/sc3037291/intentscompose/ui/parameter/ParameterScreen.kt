package br.edu.ifsp.scl.sc3037291.intentscompose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ParameterScreen(
    currentParameter: String,
    onSave: (String) -> Unit,
    onBack: () -> Unit
) {
    var text by remember { mutableStateOf(currentParameter) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Definir Parâmetro") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Parâmetro") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OutlinedButton(onClick = onBack) {
                    Text("Cancelar")
                }
                Button(onClick = { onSave(text) }) {
                    Text("Salvar")
                }
            }
        }
    }
}

annotation class ParameterScreen
