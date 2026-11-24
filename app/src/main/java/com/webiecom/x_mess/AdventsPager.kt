package com.webiecom.x_mess

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import java.time.LocalDate

@Composable
fun AdventsPager() {
    val pagesAmount = 24

    // horizontal pager
    val pagerState = rememberPagerState(pageCount = {
        pagesAmount
    })

    HorizontalPager(state = pagerState) { idx ->
        DayPage(idx)
    }

    // jump to current date

    val currentDate = LocalDate.now()
    var day = currentDate.dayOfMonth
    val month = currentDate.monthValue
    day = if (month != 11) 1    // TODO: debug -> change back to 12
    else minOf(day, 24)

    LaunchedEffect(Unit) {
        // 4. Scroll to the specific page/index
        //pagerState.animateScrollToPage(day-1)
    }
}