package com.mkrdeveloper.sideeffectsincompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

@Composable
fun produceStateExample(countTo: Int): State<Int> {
    return produceState(initialValue = 0){
        while (value < countTo){
            delay(2000L)
            value++
        }
    }

}