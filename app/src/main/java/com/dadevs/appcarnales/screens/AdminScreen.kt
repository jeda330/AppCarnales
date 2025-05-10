package com.dadevs.appcarnales.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material3.MaterialTheme
import com.dadevs.appcarnales.components.Header


@Composable
fun AdminScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally // Importa Alignment
    ) {
        Header()
        Text(text = "Administración", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        // Botones para ver las ventas y reembolsos
        Button(
            onClick = { /* Acción para ver ventas del día */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Ver Ventas del Día")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Acción para ver ventas del mes */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Ver Ventas del Mes")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Acción para reembolsos */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Reembolsos")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Botón para volver al menú anterior
        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Volver al Menú")
        }
    }
}