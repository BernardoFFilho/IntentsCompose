package br.edu.ifsp.scl.sc3037291.intentscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.edu.ifsp.scl.sc3037291.intentscompose.navigation.IntentsComposeNavHost
import br.edu.ifsp.scl.sc3037291.intentscompose.ui.theme.IntentsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntentsComposeTheme {
                IntentsComposeNavHost()
            }
        }
    }
}