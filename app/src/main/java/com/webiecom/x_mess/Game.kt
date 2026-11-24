package com.webiecom.x_mess

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

val santaClauses = listOf(
    R.drawable.sc1,
    R.drawable.sc2,
    R.drawable.sc3,
    R.drawable.sc4,
    R.drawable.sc5,
    R.drawable.sc6,
    R.drawable.sc7,
    R.drawable.sc8,
    R.drawable.sc9,
    R.drawable.sc10,
    R.drawable.sc11,
    R.drawable.sc12,
    R.drawable.sc13,
    R.drawable.sc14,
    R.drawable.sc15,
    R.drawable.sc16,
    R.drawable.sc17,
    R.drawable.sc18,
    R.drawable.sc19,
    R.drawable.sc20,
    R.drawable.sc21,
    R.drawable.sc22,
    R.drawable.sc23,
    R.drawable.sc24,
)

fun getSantas(idx: Int): List<Int> {
    when (idx) {
        0 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        1 -> return listOf(5, 23, 1, 17, 4, 1, 4, 2, 8, 10, 11, 19, 20, 4, 1, 3)
        2 -> return listOf(22, 10, 17, 17, 2, 23, 6, 9, 16, 2, 11, 0, 3, 23, 14, 7)
        3 -> return listOf(14, 0, 23, 3, 3, 11, 10, 2, 11, 4, 3, 19, 20, 19, 7, 1)
        4 -> return listOf(5, 3, 10, 4, 15, 22, 4, 7, 12, 21, 7, 8, 4, 17, 9, 10)
        5 -> return listOf(19, 14, 7, 10, 11, 5, 5, 19, 20, 5, 4, 1, 22, 16, 5, 3)
        6 -> return listOf(19, 16, 6, 7, 0, 20, 14, 6, 4, 13, 23, 0, 6, 13, 18, 7)
        7 -> return listOf(12, 6, 16, 6, 18, 20, 7, 2, 0, 20, 16, 9, 11, 1, 12, 15)
        8 -> return listOf(8, 5, 21, 3, 16, 20, 22, 8, 8, 12, 20, 21, 13, 2, 10, 23)
        9 -> return listOf(11, 1, 11, 21, 15, 9, 5, 13, 2, 9, 13, 9, 20, 17, 8, 10)
        10 -> return listOf(15, 8, 16, 19, 20, 15, 10, 10, 10, 23, 11, 4, 0, 10, 20, 18)
        11 -> return listOf(9, 4, 8, 11, 13, 11, 4, 10, 23, 21, 16, 6, 14, 22, 9, 11)
        12 -> return listOf(10, 12, 13, 12, 19, 1, 3, 20, 11, 22, 12, 16, 2, 0, 21, 12)
        13 -> return listOf(0, 20, 23, 16, 21, 12, 3, 11, 13, 17, 22, 16, 13, 9, 13, 8)
        14 -> return listOf(4, 20, 0, 3, 20, 9, 14, 2, 10, 17, 7, 8, 14, 4, 5, 15)
        15 -> return listOf(1, 19, 4, 4, 23, 14, 15, 0, 1, 16, 22, 19, 6, 15, 12, 15)
        16 -> return listOf(17, 12, 15, 11, 23, 1, 12, 13, 16, 5, 16, 22, 10, 9, 16, 17)
        17 -> return listOf(23, 14, 3, 10, 21, 2, 4, 17, 17, 5, 4, 11, 10, 0, 23, 22)
        18 -> return listOf(17, 18, 9, 18, 16, 18, 17, 8, 21, 22, 23, 9, 18, 6, 14, 15)
        19 -> return listOf(5, 17, 9, 7, 22, 0, 22, 2, 19, 16, 7, 6, 16, 2, 19, 21)
        20 -> return listOf(7, 11, 20, 5, 20, 4, 16, 19, 20, 4, 1, 11, 10, 7, 18, 20)
        21 -> return listOf(13, 6, 2, 22, 11, 15, 21, 13, 21, 18, 0, 22, 21, 1, 10, 8)
        22 -> return listOf(14, 22, 17, 15, 22, 12, 3, 23, 10, 22, 6, 15, 1, 16, 22, 9)
        23 -> return listOf(23, 23, 23, 14, 23, 14, 23, 23, 23, 23, 14, 23, 23, 23, 23, 23) // perfect
    }

    return listOf(0)
}

@Composable
fun Game(idx: Int) {
    Image(
        painter = painterResource(santaClauses[idx]),
        contentDescription = "Santa Claus",
        modifier = Modifier.size(100.dp)
    )
    Spacer(Modifier.height(46.dp))

    val santas = getSantas(idx)
    Column {
        santas.chunked(4).forEach { rowItems ->
            Row(Modifier.padding(bottom = 14.dp)) {
                rowItems.forEach { santa ->
                    var imageId by remember { mutableIntStateOf(santaClauses[santa]) }
                    var clicked by remember { mutableStateOf(false) }

                    Image(
                        painter = painterResource(imageId),
                        contentDescription = "Santa Claus",
                        modifier = Modifier
                            .size(75.dp)
                            .clickable(enabled = !clicked) {
                                imageId = if (idx == santa) R.drawable.check else R.drawable.cross
                                clicked = true
                            }
                    )
                }
            }
        }
    }
}