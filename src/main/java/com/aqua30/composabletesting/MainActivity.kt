package com.aqua30.composabletesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.aqua30.composabletesting.presentation.CounterDisplay
import com.aqua30.composabletesting.ui.theme.ComposableTestingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableTestingTheme {
                CounterDisplay(modifier = Modifier.fillMaxSize().background(Color.Black))
            }
        }
    }
}