package br.edu.ifsp.scl.sc3037291.intentscompose.navigation

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.edu.ifsp.scl.sc3037291.intentscompose.ParameterScreen
import br.edu.ifsp.scl.sc3037291.intentscompose.ui.main.MainScreen
sealed class Screen(val route: String) {
    object Main : Screen("main")
    object Parameter : Screen("parameter")
}

@Composable
fun IntentsComposeNavHost() {
    val navController = rememberNavController()
    var parameter by remember { mutableStateOf("") }

    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) {
            MainScreen(
                parameter = parameter,
                onSetParameter = { navController.navigate(Screen.Parameter.route) }
            )
        }
        composable(Screen.Parameter.route) {
            ParameterScreen(
                currentParameter = parameter,
                onSave = {
                    parameter = it
                    navController.popBackStack()
                },
                onBack = { navController.popBackStack() }
            )
        }
    }
}