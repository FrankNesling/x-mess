package com.webiecom.x_mess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.webiecom.x_mess.ui.theme.XMessTheme
import com.webiecom.x_mess.ui.theme.backgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            navigationBarStyle = SystemBarStyle.light(
                scrim = backgroundColor.toArgb(),
                darkScrim = backgroundColor.toArgb()
            )
        )

        super.onCreate(savedInstanceState)

        setContent {
            XMessTheme {
                AdventsPager()
            }
        }
    }
}