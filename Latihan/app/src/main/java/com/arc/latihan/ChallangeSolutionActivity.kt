package com.arc.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arc.latihan.ui.theme.LatihanTheme

class ChallangeSolutionActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            LatihanTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Solution()
                }
            }
        }
    }
}

@Composable
fun Solution(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row (modifier = Modifier.weight(1f)){
            Content(
                name = stringResource(id = R.string.Char1) ,
                description = stringResource(id = R.string.Char1),
                backgroundColor = colorResource(id = R.color.mainColor),
                modifier = Modifier.weight(1f),
                image = R.drawable.naruto1
            )
            Content(
                name =stringResource(id = R.string.Char2) ,
                description = stringResource(id = R.string.Char2),
                backgroundColor = Color.Magenta,
                modifier = Modifier.weight(1f),
                image = R.drawable.naruto2
            )
            Content(
                name =stringResource(id = R.string.Char3) ,
                description = stringResource(id = R.string.Char3),
                backgroundColor = Color.Gray,
                modifier = Modifier.weight(1f),
                image = R.drawable.naruto3
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Content(
                name = stringResource(id = R.string.Char4) ,
                description = stringResource(id = R.string.Char4),
                backgroundColor = Color.DarkGray,
                modifier = Modifier.weight(1f),
                image = R.drawable.sasuke1
            )
            Content(
                name =stringResource(id = R.string.Char5) ,
                description = stringResource(id = R.string.Char5),
                backgroundColor = Color.Red,
                modifier = Modifier.weight(1f),
                image = R.drawable.sasuke2
            )
            Content(
                name =stringResource(id = R.string.Char6),
                description = stringResource(id = R.string.Char6),
                backgroundColor = Color.Blue,
                modifier = Modifier.weight(1f),
                image = R.drawable.naruto3
            )
        }
    }
}

@Composable
private fun Content(
    name: String,
    description : String,
    backgroundColor : Color,
    modifier : Modifier,
    image : Int
){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
       Image(
           painter = painterResource(id = image),
           contentDescription = "",
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .size(90.dp)
               .clip(CircleShape)
               .border(2.dp, Color.White, CircleShape)
       )
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp),
            fontSize = 24.sp,
            color = Color.White
        )
        Text(
            text = description,
            modifier = Modifier.padding(bottom = 4.dp),
            fontSize = 18.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthDayPreview(){
    LatihanTheme {
        Solution()
    }
}
