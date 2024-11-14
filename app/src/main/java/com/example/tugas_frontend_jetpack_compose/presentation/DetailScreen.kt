package com.example.tugas_frontend_jetpack_compose.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugas_frontend_jetpack_compose.data.DummyData
import com.example.tugas_frontend_jetpack_compose.model.DetailTanaman
import com.example.tugas_frontend_jetpack_compose.presentation.component.DetailTanamanItem

@Composable
fun DetailScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    detaill: List<DetailTanaman> = DummyData.DetailTanamanHias,
) {
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ){
        item {
            LazyRow (
                contentPadding = PaddingValues(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = modifier
            ){
                items(detaill, key = { it.id }) { detailItem ->
                    DetailTanamanItem(
                        detail = detailItem,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }
        }
    }
}