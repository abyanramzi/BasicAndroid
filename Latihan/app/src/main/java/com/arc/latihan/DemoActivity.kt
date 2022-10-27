package com.arc.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Demo()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Demo (){
    val hijauMuda = Color(0xff123f12)
    val putih = 0xffff0000
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "")
        Spacer(modifier = Modifier.height(24.dp))
        Surface(color = Color.DarkGray, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Hallo Abyan",
                fontSize = 18.sp,
                modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 20.dp),
                color = hijauMuda,
                textAlign = TextAlign.Center
            )
        }
        Surface(color = Color.Black, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Semangat",
                fontSize = 24.sp,
                modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 20.dp),
                color = Color(putih),
                textAlign = TextAlign.Center
            )
        }
    }
}