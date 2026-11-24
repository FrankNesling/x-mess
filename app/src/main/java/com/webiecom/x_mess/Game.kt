package com.webiecom.x_mess

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Game() {
    repeat(3) {
        Row(Modifier.padding(bottom = 14.dp)) {
            repeat(4) {
                Image(
                    painter = painterResource(R.drawable.sc1),
                    contentDescription = "Santa Claus",
                    modifier = Modifier.size(75.dp)
                )
            }
        }
    }
}