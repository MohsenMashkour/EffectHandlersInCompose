package com.mkrdeveloper.sideeffectsincompose.ui.theme

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun CoroutineScopeExample() {
    val scope = rememberCoroutineScope()
    Button(onClick = {
        scope.launch {
            delay(2000L)
            //start a process
        }
    }) {

    }
}