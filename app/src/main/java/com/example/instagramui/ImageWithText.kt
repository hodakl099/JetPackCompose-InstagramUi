package com.example.instagramui

import androidx.compose.ui.graphics.painter.Painter
//Data class that represents Image and Text in HighLightSection, and PostTabView.
data class ImageWithText(
    val image : Painter,
    val text : String
)
