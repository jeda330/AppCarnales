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
import com.dadevs.appcarnales.components.Header

@Composable
fun SalesScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Registrar Ventas - SalesScreen", modifier = Modifier.padding(bottom = 20.dp))

        // Botones de productos de la licorera
        Button(
            onClick = { /* Acción para Cerveza */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Cerveza")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Acción para Ron */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Ron")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Acción para Agua ardiente */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Agua ardiente")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Acción para Botella de agua */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Botella de agua")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Acción para Tequila */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Tequila")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Botón para volver al menú principal
        Button(
            onClick = { navController.navigate("main_menu") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Volver al Menú Principal")
        }
    }
}