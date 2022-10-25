package com.arc.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign


class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val hijauMuda = Color(0xff123f12)
        val putih = 0xffff0000
        setContent{
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "")
                Surface(color = Color.DarkGray, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Hallo Abyan",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(50.dp, 10.dp, 100.dp, 0.dp),
                        color = hijauMuda,
                        textAlign = TextAlign.Center
                    )
                }
                Surface(color = Color.Black, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Semangat",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(50.dp, 10.dp, 10.dp, 10.dp),
                        color = Color(putih),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}