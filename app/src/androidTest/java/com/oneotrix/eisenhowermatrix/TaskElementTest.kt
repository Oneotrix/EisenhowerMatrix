package com.oneotrix.eisenhowermatrix

import androidx.compose.ui.test.junit4.createComposeRule
import com.oneotrix.eisenhowermatrix.view.components.TaskListElement
import com.oneotrix.eisenhowermatrix.view.model.Task
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class TaskElementTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Mock
    val task: Task = Mockito.mock(Task::class.java)

    @Test
    private fun test() {
        composeTestRule.setContent {

            TaskListElement(task)
        }
    }
}