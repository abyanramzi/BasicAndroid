package com.arc.latihan.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavigationRoute.ScreenSatu.name
    ){
        composable(
            NavigationRoute.ScreenSatu.name
        ){
            ScreenSatu(navController)
        }
        composable(
            NavigationRoute.ScreenDua.name
        ){
            ScreenDua(navController)
        }
    }
}