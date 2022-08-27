package com.aqua30.composabletesting.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aqua30.composabletesting.presentation.CounterHelper.processInput

/**
 * Created by Saurabh
 */
@Composable
fun CounterDisplay(
    modifier: Modifier
) {

    var editedText by remember {
        mutableStateOf("")
    }

    var counterText by remember {
        mutableStateOf("Start copying")
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.testTag("Counter Display"),
            text = counterText,
            style = TextStyle(
                fontSize = 36.sp,
                color = Color.White
            )
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .testTag("Input"),
            value = editedText,
            onValueChange = {
                editedText = it
            },
            label = {
                Text("Input")
            },
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
            ),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                counterText = processInput(editedText)
            }
        ) {
            Text(
                text = "Copy",
                style = TextStyle(
                    fontSize = 26.sp,
                    color = Color.White
                )
            )
        }
    }
}

@Preview
@Composable
fun CounterDisplayPreview() {
    CounterDisplay(modifier = Modifier.fillMaxSize())
}