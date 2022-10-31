package com.arc.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class ChallangeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Challange()
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Challange() {
    // Mencari Ukuran Layar (Pixel)
    val screenWidth = Resources.getSystem().displayMetrics.widthPixels
    val screenHeight = Resources.getSystem().displayMetrics.heightPixels
    // Mencari Ratio (dp:pixel)
    val ratioScreen = Resources.getSystem().displayMetrics.xdpi/Resources.getSystem().displayMetrics.widthPixels
    // Mencari Ukuran Konten
    val maxContentWidth = ((screenWidth/3)*ratioScreen)
    val maxContentHeight = ((screenHeight/2)*ratioScreen)
    // Tes Print
    println("Ini Lebar Layar: " + screenWidth)
    println("Ini Tinggi Layar: " + screenHeight)
    println("Ini Rasio: " + ratioScreen)
    println("Ini Lebar Konten: " + maxContentWidth)
    println("Ini Tinggi Konten: " + maxContentHeight)

    // Define Warna
    val mainColor = Color(0xFF141923)
    val secondColor = Color(0xFFEEBA2B)
    val biruTua = Color(0xFF295BB7)
    val biruMuda = Color(0xFF5C8BE1)
    val kuningMuda = Color(0xFFF5E365)
    val cream = Color(0xFFFFF5D6)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            //Content 1
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = mainColor
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.naruto1),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.White, CircleShape)
                    )
                    Text(
                        text = "Naruto 1",
                        color = Color.White,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Naruto 1",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }
            //Content 2
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = secondColor
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.naruto3),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Naruto 2",
                        color = Color.Black,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Naruto 2",
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                }
            }
            //Content 3
            Surface(modifier = Modifier
                .size(maxContentWidth.dp, maxContentHeight.dp),
                color = biruTua
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.naruto2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.White, CircleShape)
                    )
                    Text(
                        text = "Naruto 3",
                        color = Color.White,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Naruto 3",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            //Content 1
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = kuningMuda
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sasuke1),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Sasuke 1",
                        color = Color.Black,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Sasuke 1",
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                }
            }
            //Content 2
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = biruMuda
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sasuke2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.White, CircleShape)
                    )
                    Text(
                        text = "Sasuke 2",
                        color = Color.White,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Sasuke 2",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }
            //Content 3
            Surface(modifier = Modifier
                .size(maxContentWidth.dp, maxContentHeight.dp),
                color = cream
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sasuke3),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Sasuke 3",
                        color = Color.Black,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Sasuke 3",
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}