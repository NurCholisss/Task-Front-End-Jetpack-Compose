package com.example.tugas_frontend_jetpack_compose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.tugas_frontend_jetpack_compose.model.AboutMe
import com.example.tugas_frontend_jetpack_compose.ui.theme.Tugas_FrontEnd_Jetpack_ComposeTheme

@Composable
fun AboutItem(
    tentangku: AboutMe,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = tentangku.photo),
            contentDescription = tentangku.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = tentangku.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        Text(
            text = tentangku.email,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        Text(
            text = tentangku.universitas,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        Text(
            text = tentangku.prodi,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    Tugas_FrontEnd_Jetpack_ComposeTheme {
        AboutItem(
            tentangku = AboutMe(
                1,
                R.drawable.aku,
                "Nama: Nur Cholis Romadhon",
                "Email: nurc11700@gmail.com",
                "Universitas: Universitas Amikom Purwokerto",
                "Prodi: INFORMATIKA"
            )
        )
    }
}