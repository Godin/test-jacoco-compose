package org.example

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class ExampleTest {

    @get:Rule
    val compose = createComposeRule()

    @Test
    fun test() {
        compose.setContent {
            example(0)
            example(1)
        }
    }

}
