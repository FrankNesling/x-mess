package com.webiecom.x_mess

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
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
        2 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        3 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        4 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        5 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        6 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        7 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        8 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        9 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        10 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        11 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        12 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        13 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        14 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        15 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        16 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        17 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        18 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        19 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        20 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        21 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        22 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
        23 -> return listOf(0, 2, 2, 22, 17, 23, 5, 0, 4, 0, 14, 7, 16, 3, 7, 9)
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
                    Image(
                        painter = painterResource(santaClauses[santa]),
                        contentDescription = "Santa Claus",
                        modifier = Modifier.size(75.dp)
                    )
                }
            }
        }
    }
}