package com.example.weatherapp.screen.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomItem(var title:String, var icon: ImageVector, var screen_route:String){

    object Home : BottomItem("Home", Icons.Default.Home,"home")
    object Details : BottomItem("Details", Icons.Default.List,"details")
    object Settings : BottomItem("Settings", Icons.Default.Settings,"details")
}