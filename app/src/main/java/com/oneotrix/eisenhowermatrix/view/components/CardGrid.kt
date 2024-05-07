package com.oneotrix.eisenhowermatrix.view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceImportantNotUrgent
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceImportantUrgent
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceNotImportantNotUrgent
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceNotImportantUrgent
import com.oneotrix.eisenhowermatrix.view.model.Status

@Composable
fun CardGreed() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
        ) {
            
            MainCard(status = Status.URGENT_AND_IMPORTANT)

            Spacer(modifier = Modifier.width(1.dp))

            MainCard(status = Status.NOT_URGENT_AND_IMPORTANT)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row {
            MainCard(status = Status.URGENT_AND_NOT_IMPORTANT)

            Spacer(modifier = Modifier.width(1.dp))

            MainCard(status = Status.NOT_URGENT_AND_NOT_IMPORTANT)
        }
    }
}


@Composable
@Preview(widthDp = 400, heightDp = 800)
fun CardGreedPreview() {
    CardGreed()
}