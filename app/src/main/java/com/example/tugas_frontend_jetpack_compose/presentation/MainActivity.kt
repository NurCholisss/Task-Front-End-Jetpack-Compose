package com.example.tugas_frontend_jetpack_compose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.tugas_frontend_jetpack_compose.ui.theme.Tugas_FrontEnd_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas_FrontEnd_Jetpack_ComposeTheme {
                Surface (
                    modifier = androidx.compose.ui.Modifier,
                    color = MaterialTheme.colorScheme.background
                ){
                    AppTanaman()
                }
            }
        }
    }
}