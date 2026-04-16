package br.edu.ifsp.scl.sc3037291.intentscompose

sealed class Screen(val route: String) {
    object Main : Screen("main")
    object Parameter : Screen("parameter")
}