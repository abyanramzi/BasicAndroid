package com.arc.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class StatefulActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EchoText()
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EchoText(){
    var displayText by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (displayText.isNotEmpty()){
            Text(
                text = "Hallo Mr " + displayText
            )
        }
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        OutlinedTextField(
            value = displayText,
            onValueChange = {
                displayText= it
            },
            label = {
                Text(text = "Name")
            }
        )
    }
}
