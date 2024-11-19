package com.javierCastillo.EJ2.ui.Pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListaColores(colores: List<Color>, onSeleccionar: (Color) -> Unit) {
    Row(modifier = Modifier.padding(16.dp)) {
        colores.forEach { color ->
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .border(0.5.dp, Color.Black)
                    .background(color)
                    .clickable { onSeleccionar(color) }
                    .padding(8.dp)

            )
        }
    }
}
