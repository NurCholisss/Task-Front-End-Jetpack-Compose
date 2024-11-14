package com.example.tugas_frontend_jetpack_compose.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.tugas_frontend_jetpack_compose.data.DummyData
import com.example.tugas_frontend_jetpack_compose.model.AboutMe
import com.example.tugas_frontend_jetpack_compose.presentation.component.AboutItem

@Composable
fun AboutScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    tentangku: List<AboutMe> = DummyData.Tentangku
) {
    LazyColumn (
        modifier = modifier.padding(16.dp)
    ){
        items(tentangku) { item ->
            AboutItem(
                tentangku = item,
                modifier = Modifier.padding(vertical = 8.dp) // Padding antara item
            )
        }
    }
}