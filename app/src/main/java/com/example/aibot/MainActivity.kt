package com.example.aibot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.aibot.ui.theme.AibotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AibotTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                     // Call the CameraPermissionScreen
                        BakingScreen() // Call your main camera/chatbot screen

//                    CameraPermissionScreen {
//                        cameraScreen() // Call the camera screen after permission is granted
//                    }
                }
            }
        }
    }
}