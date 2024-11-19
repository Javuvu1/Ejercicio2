package com.javierCastillo.EJ2.ui.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun SeleccionColor() {
    var colorSeleccionado by remember { mutableStateOf(Color.Gray) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        ListaColores(
            colores = listOf(
                Color.Red, Color.Green, Color.Blue, Color.Yellow,
                Color.Magenta, Color.Cyan, Color.Black, Color.White),
            onSeleccionar = { colorSeleccionado = it }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(colorSeleccionado)
                .border(2.dp, Color.Black)
        )
    }
}