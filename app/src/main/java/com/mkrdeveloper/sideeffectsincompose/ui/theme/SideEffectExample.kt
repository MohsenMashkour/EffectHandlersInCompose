package com.mkrdeveloper.sideeffectsincompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectExample(nonComposeValue: Boolean ){

    SideEffect {
        //do something after each successful recomposition
    }
}



