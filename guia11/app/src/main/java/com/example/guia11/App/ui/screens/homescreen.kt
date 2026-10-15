package com.example.guia11.App.ui.screens

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import com.example.guia11.App.ui.utils.obtWindowSizeClass

@Composable
fun HomeScreen2 (){
    val windowSizeClass= obtWindowSizeClass()
    when (windowSizeClass.widthSizeClass){
        WindowWidthSizeClass.Compact -> HomeScreenS()
        WindowWidthSizeClass.Medium ->HomeScreenM()
        WindowWidthSizeClass.Expanded-> HomeScreenL()
    }
}