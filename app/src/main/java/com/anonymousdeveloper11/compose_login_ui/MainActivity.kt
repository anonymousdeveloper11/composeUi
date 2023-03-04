package com.anonymousdeveloper11.compose_login_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.anonymousdeveloper11.compose_login_ui.ui.theme.Compose_login_uiTheme
import com.anonymousdeveloper11.compose_login_ui.ui_screen.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_login_uiTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}

