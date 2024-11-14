package com.example.tugas_frontend_jetpack_compose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugas_frontend_jetpack_compose.R
import com.example.tugas_frontend_jetpack_compose.model.DetailTanaman
import com.example.tugas_frontend_jetpack_compose.ui.theme.Tugas_FrontEnd_Jetpack_ComposeTheme

@Composable
fun DetailTanamanItem(
    detail: DetailTanaman,
    modifier: Modifier = Modifier
) {
   Row (
       verticalAlignment = Alignment.CenterVertically,
       modifier = modifier
           .fillMaxWidth()
           .wrapContentHeight()
   ){
       Image(
           painter = painterResource(id = detail.foto),
           contentDescription = detail.nama,
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .clip(CircleShape)
               .size(80.dp)
       )
       Column (
           modifier = Modifier
               .padding(start = 8.dp)
               .fillMaxWidth()
               .wrapContentHeight()
       ){
           Text(
               text = detail.nama,
               style = MaterialTheme.typography.titleMedium,
               overflow = TextOverflow.Ellipsis,
               maxLines = 1
           )

           Spacer(modifier = Modifier.height(8.dp))

           Text(
               text = detail.jenis,
               style = MaterialTheme.typography.bodyMedium,
               overflow = TextOverflow.Ellipsis,
               maxLines = 1
           )

           Spacer(modifier = Modifier.height(6.dp))

           Text(
               text = detail.deskripsi,
               style = MaterialTheme.typography.bodySmall,
           )
       }
   }
}

@Preview(showBackground = true)
@Composable
private fun DetailTanamanItemPreview() {
    Tugas_FrontEnd_Jetpack_ComposeTheme {
        DetailTanamanItem(
            detail = DetailTanaman(
                1,
                "Bunga Kertas",
                R.drawable.bunga_kertas,
                "  Jenis: Tanaman Hias Jenis Bunga",
                "  Deskripsi: Bunga kertas, juga dikenal sebagai Bougainvillea, adalah sebuah tanaman hias yang sangat populer di Indonesia dan berbagai tempat lainnya. Dengan warna bunga yang beragam dan indah, tanaman ini sering digunakan sebagai penghias rumah, kantor, dan taman."
            )
        )
    }
}