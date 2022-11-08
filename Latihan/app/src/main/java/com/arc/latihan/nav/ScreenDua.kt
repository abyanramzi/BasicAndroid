package com.arc.latihan.nav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.arc.latihan.R

@Composable
fun ScreenDua(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.film_5),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp),
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.DarkGray,
                contentColor = Color.White
            )
        ) {
            Text(text = "Welcome to The Dream")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenDuaPreview(){
    ScreenDua(rememberNavController())
}