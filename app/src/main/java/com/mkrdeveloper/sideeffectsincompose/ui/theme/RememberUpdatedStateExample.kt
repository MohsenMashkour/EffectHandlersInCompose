package com.mkrdeveloper.sideeffectsincompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateExample(
    onTimeout: () -> Unit
) {
    val updateOnTimeout by rememberUpdatedState(newValue = onTimeout)
    LaunchedEffect(key1 = true) {
        delay(2000L)
        updateOnTimeout
    }
}