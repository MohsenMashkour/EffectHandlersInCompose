package com.mkrdeveloper.sideeffectsincompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

@Composable
fun LaunchedEffectExample() {
    var successfulCall by remember {
        mutableStateOf(true)
    }

    LaunchedEffect(key1 = successfulCall) {
        delay(3000L)
        //network call

        if (network call isSuccessful) {
            //display the result
        } else {
            successfulCall = !successfulCall
        }
    }

}