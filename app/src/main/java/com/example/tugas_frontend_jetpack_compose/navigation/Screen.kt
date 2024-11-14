package com.example.tugas_frontend_jetpack_compose.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Detail: Screen("detailTanaman")
    object DetailWithId : Screen("detail/{tanamanId}")
    data object About: Screen("aboutme")
}