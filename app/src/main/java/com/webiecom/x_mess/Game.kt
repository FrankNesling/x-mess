package com.webiecom.x_mess

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.webiecom.x_mess.ui.theme.darkText
import com.webiecom.x_mess.ui.theme.textColor

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
        0 -> return listOf(5, 8, 0, 0, 0, 5, 7, 0, 5, 2, 11, 0, 18, 8, 0, 5)
        1 -> return listOf(1, 0, 17, 19, 1, 18, 9, 19, 1, 21, 20, 2, 19, 21, 17, 1)
        2 -> return listOf(18, 15, 2, 3, 5, 21, 15, 2, 13, 6, 2, 2, 2, 13, 0, 13)
        3 -> return listOf(0, 3, 5, 22, 3, 15, 3, 19, 22, 7, 6, 3, 10, 22, 3, 10)
        4 -> return listOf( 20, 13, 8, 0, 4, 22, 4, 5, 4, 13, 10, 23, 23, 4, 4, 20)
        5 -> return listOf(5, 21, 16, 0, 5, 5, 0, 23, 11, 16, 0, 5, 21, 6, 7, 5)
        6 -> return listOf(9, 11, 11, 6, 3, 2, 16, 6, 17, 11, 6, 10, 11, 17, 6, 10)
        7 -> return listOf(3, 22, 4, 12, 7, 12, 7, 22, 7, 2, 5, 0, 22, 7, 0, 7)
        8 -> return listOf(23, 8, 8, 16, 20, 8, 14, 19, 8, 6, 20, 4, 8, 16, 23, 16)
        9 -> return listOf(12, 20, 9, 15, 9, 4, 12, 6, 9, 20, 15, 12, 20, 15, 12, 9)
        10 -> return listOf(10, 11, 3, 13, 16, 10, 22, 17, 10, 13, 10, 11, 16, 17, 11, 22)
        11 -> return listOf(5, 16, 11, 23, 21, 6, 11, 5, 11, 11, 14, 16, 5, 16, 11, 19)
        12 -> return listOf(22, 12, 15, 7, 20, 12, 9, 22, 9, 20, 12, 15, 7, 9, 12, 12)
        13 -> return listOf(13, 17, 15, 13, 13, 14, 21, 6, 3, 2, 15, 13, 2, 13, 2, 6)
        14 -> return listOf(23, 13, 14, 14, 16, 23, 17, 14, 14, 16, 23, 14, 4, 13, 14, 16)
        15 -> return listOf(13, 15, 20, 9, 4, 15, 18, 15, 2, 9, 20, 15, 21, 9, 15, 15)
        16 -> return listOf(14, 16, 4, 16, 23, 16, 20, 16, 16, 13, 14, 23, 23, 14, 16, 4)
        17 -> return listOf(13, 17, 1, 21, 17, 17, 19, 17, 6, 14, 17, 17, 21, 17, 20, 19)
        18 -> return listOf(18, 18, 21, 1, 13, 18, 21, 21, 18, 19, 13, 21, 18, 19, 18, 18)
        19 -> return listOf(1, 19, 19, 8, 18, 19, 17, 19, 19, 21, 14, 19, 19, 20, 19, 8)
        20 -> return listOf(1, 12, 20, 17, 20, 18, 21, 20, 12, 1, 9, 20, 17, 21, 20, 1)
        21 -> return listOf(20, 21, 1, 21, 17, 18, 17, 5, 21, 2, 21, 20, 18, 5, 18, 17)
        22 -> return listOf(22, 0, 7, 22, 12, 22, 22, 10, 17, 10, 22, 13, 22, 0, 10, 22)
        23 -> return listOf(23, 23, 23, 14, 23, 14, 11, 23, 23, 23, 14, 23, 23, 11, 23, 11)
    }

    return listOf(0)
}

fun getCorrectSantaAmount(idx: Int): Int {
    return getSantas(idx).count {it == idx}
}

fun getScoreText(incorrectSantas: Int): String {
    when(incorrectSantas) {
        0 -> return "Perfect score."
        1 -> return "One mistake."
        2 -> return "Two mistakes."
        3 -> return "Three mistakes? Too hard?"
        4 -> return "Four. Four incorrect santas..."
        5 -> return "So many? Five you got wrong."
        6 -> return "Impressive six were incorrect."
        7 -> return "How can you get seven wrong?"
        8 -> return "Eight? Really eight wrong?"
        9 -> return "Nine wrong. No comment."
        10 -> return "Did you even look? Ten wrong."
        in 11..20 -> return "You got ... $incorrectSantas "
        in 21..24 -> return "Mighty. Truly mighty $incorrectSantas wrong."
        else -> return "Not possible."
    }
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
    var correctSantas by remember { mutableIntStateOf(0) }
    var incorrectSantas by remember { mutableIntStateOf(0)}

    // game
    if (correctSantas < getCorrectSantaAmount(idx)) {
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
                                    val correctSanta = idx == santa
                                    imageId = if (correctSanta) R.drawable.check else R.drawable.cross
                                    clicked = true
                                    if (correctSanta) correctSantas++ else incorrectSantas++
                                }
                        )
                    }
                }
            }
        }
    } else {    // game completed
        LaunchedEffect(correctSantas == getCorrectSantaAmount(idx)) {

        }

        Text(
            text = "You found all Santas. Congratulations.",
            fontSize = 30.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            color = darkText,
            fontWeight = FontWeight.Black
        )
        Spacer(Modifier.height(24.dp))
        Text(
            text = "Your score:\n" + getScoreText(incorrectSantas),
            fontSize = 25.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Center,
            color = textColor,
            fontWeight = FontWeight.Black
        )
    }
}