package com.example.tugas_frontend_jetpack_compose.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugas_frontend_jetpack_compose.data.DummyData
import com.example.tugas_frontend_jetpack_compose.model.Tanaman
import com.example.tugas_frontend_jetpack_compose.navigation.Screen
import com.example.tugas_frontend_jetpack_compose.presentation.component.TanamanItemHorizontal
import com.example.tugas_frontend_jetpack_compose.presentation.component.TanamanItemVertical

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    tanamans: List<Tanaman> = DummyData.tanamanHias,
    ) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = modifier
    ) {
        LazyColumn (
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
        ){
            item{
                LazyRow (
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                ){
                    items(tanamans, key = {it.id}) {
                        TanamanItemHorizontal(tanaman = it) {tanamanId ->
                            navController.navigate(Screen.Detail.route +"/$tanamanId")
                        }
                    }
                }
            }
            items(tanamans, key = {it.id}) {
                TanamanItemVertical(tanaman = it,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    onItemClicked = { tanamanId: Int ->
                        navController.navigate(Screen.Detail.route +"/$tanamanId")
                    }
                )
            }
        }
    }
}