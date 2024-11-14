package com.example.tugas_frontend_jetpack_compose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugas_frontend_jetpack_compose.R
import com.example.tugas_frontend_jetpack_compose.model.Tanaman
import com.example.tugas_frontend_jetpack_compose.ui.theme.Tugas_FrontEnd_Jetpack_ComposeTheme

@Composable
fun TanamanItemHorizontal(
    tanaman: Tanaman,
    modifier: Modifier = Modifier,
    onItemClicked: (Int)-> Unit
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(tanaman.id)
        }
    ){
        Image(
            painter = painterResource(id = tanaman.foto),
            contentDescription = tanaman.nama, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = tanaman.nama,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(120.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TanamanItemHorizontalPreview() {
    Tugas_FrontEnd_Jetpack_ComposeTheme {
        TanamanItemHorizontal(
            tanaman = Tanaman(1, "Bunga Kertas", R.drawable.bunga_kertas),
            onItemClicked = { tanamanId: Int ->
                println("tanaman Id : $tanamanId")
            }
        )
    }
}