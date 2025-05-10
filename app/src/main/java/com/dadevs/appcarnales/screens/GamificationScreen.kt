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
fun GamificationScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        // Título de la pantalla
        Text(text = "Gamificación", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        // Botón para ver puntos de usuario
        Button(
            onClick = { /* Acción para ver puntos de usuario */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)), // Color amarillo
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Ver Puntos de Usuario") // Contenido del botón
        }
        Spacer(modifier = Modifier.height(10.dp))

        // Botón para redimir puntos
        Button(
            onClick = { /* Acción para redimir puntos */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)), // Color amarillo
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Redimir Puntos") // Contenido del botón
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Botón para volver al menú anterior
        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)), // Color amarillo
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Volver al Menú") // Contenido del botón
        }
    }
}