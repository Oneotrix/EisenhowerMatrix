package com.oneotrix.eisenhowermatrix.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oneotrix.eisenhowermatrix.ui.theme.cardTitleColor
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceImportantNotUrgent
import com.oneotrix.eisenhowermatrix.view.model.Task
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceImportantUrgent
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceNotImportantNotUrgent
import com.oneotrix.eisenhowermatrix.ui.theme.surfaceNotImportantUrgent
import com.oneotrix.eisenhowermatrix.ui.theme.taskTextColor
import com.oneotrix.eisenhowermatrix.view.model.Status

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainCard(
    status: Status,
    modifier: Modifier = Modifier.width(170.dp).height(320.dp)
) {

    val color = selectColorByStatus(status)

    ElevatedCard(
        modifier = modifier,
        onClick = { /*TODO*/ },
        colors = CardDefaults.elevatedCardColors(
            containerColor = color,
            contentColor = cardTitleColor
        )

    ) {
        Column {

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = Status.getTitleByStatus(status)
                )

            Spacer(modifier = Modifier.height(20.dp))

            TaskList(taskList = list)
        }
    }
}

private fun selectColorByStatus(status: Status): Color = when(status) {
    Status.URGENT_AND_IMPORTANT -> surfaceImportantUrgent
    Status.URGENT_AND_NOT_IMPORTANT -> surfaceNotImportantUrgent
    Status.NOT_URGENT_AND_IMPORTANT -> surfaceImportantNotUrgent
    Status.NOT_URGENT_AND_NOT_IMPORTANT -> surfaceNotImportantNotUrgent
}
//
//@Composable
//@Preview(widthDp = 170, heightDp = 300)
//fun MainCardPreview() {
//    MainCard(
//        backgroundColor = surfaceImportantUrgent
//    )
//}

@Composable
fun TaskList(taskList: List<Task>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(taskList) {
            TaskListElement(task = it)
        }
    }
}

@Composable
@Preview(widthDp = 170, heightDp = 300)
fun TaskListPreview() {
    TaskList(list)
}


@Composable
fun TaskListElement(task: Task) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 6.dp)
            .background(color = cardTitleColor, shape = RoundedCornerShape(4.dp))
        ,
        horizontalArrangement = Arrangement.Start
    ) {
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = "${task.id}",
            color = taskTextColor,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "${task.title}",
            color = taskTextColor,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(widthDp = 160, heightDp = 20)
fun TaskListElementPreview() {
    TaskListElement(task)
}






val task = Task(
    id = 1,
    title = "Title",
    description = "description",
    status = Status.NOT_URGENT_AND_NOT_IMPORTANT
)

val list = listOf(
    task,
    task,
    task,
    task,
    task,
    task,
    task,
    task
)