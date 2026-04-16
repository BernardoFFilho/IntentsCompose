package br.edu.ifsp.scl.sc3037291.intentscompose.ui.main

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    parameter: String,
    onSetParameter: () -> Unit
) {
    var menuExpanded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("IntentsCompose") },
                actions = {
                    IconButton(onClick = { menuExpanded = true }) {
                        Icon(Icons.Default.MoreVert, contentDescription = "Menu")
                    }
                    DropdownMenu(
                        expanded = menuExpanded,
                        onDismissRequest = { menuExpanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("Definir parâmetro") },
                            onClick = {
                                menuExpanded = false
                                onSetParameter()
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Abrir URL") },
                            onClick = {
                                menuExpanded = false
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ifsp.edu.br"))
                                context.startActivity(intent)
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Discar") },
                            onClick = {
                                menuExpanded = false
                                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+5516999999999"))
                                context.startActivity(intent)
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Ligar") },
                            onClick = {
                                menuExpanded = false
                                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:+5516999999999"))
                                context.startActivity(intent)
                            }
                        )
                    }
                }
            )
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
            Text("Parâmetro atual:")
            Spacer(modifier = Modifier.height(8.dp))
            Text(parameter, style = MaterialTheme.typography.headlineMedium)
        }
    }
}