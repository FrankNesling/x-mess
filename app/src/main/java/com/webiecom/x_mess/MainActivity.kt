package com.webiecom.x_mess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.webiecom.x_mess.ui.theme.XMessTheme
import com.webiecom.x_mess.ui.theme.backgroundColor
import android.media.MediaPlayer

class MainActivity : ComponentActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            navigationBarStyle = SystemBarStyle.light(
                scrim = backgroundColor.toArgb(),
                darkScrim = backgroundColor.toArgb()
            )
        )

        super.onCreate(savedInstanceState)

        // music
        mediaPlayer = MediaPlayer.create(this, R.raw.christmasmusic).apply {
            isLooping = true
            setVolume(0.5f, 0.5f)
        }

        setContent {
            XMessTheme {
                AdventsPager()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        mediaPlayer?.start()
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer?.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}