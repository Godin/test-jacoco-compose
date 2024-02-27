package org.example

import androidx.compose.runtime.Composable

@Composable
fun example(x: Int) {
  if (x == 0) {
    nop(x)
  } else {
    nop(x)
  }
}

@Suppress("UNUSED_PARAMETER")
@Composable
private fun nop(x: Any) {
}
