package com.dadevs.appcarnales.screens   // Define la ubicación del archivo dentro del proyecto. En este caso, el archivo pertenece al paquete screens dentro de tu proyecto com.dadevs.appcarnales.

import androidx.compose.foundation.layout.*  // Estas importaciones traen componentes y funciones necesarias para construir la interfaz de usuario: layout.*: permite estructurar elementos en columnas, filas, espaciados, rellenos, etc.Button, Text: elementos visuales de Material 3.ButtonDefaults: personalización de botones.Modifier: para modificar dimensiones y posiciones.Color, dp: para definir colores y medidas.NavHostController: permite navegar entre pantallas.Header: componente personalizado reutilizable que tú creaste (probablemente con logo y nombre de la app).
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dadevs.appcarnales.components.Header

@Composable //  Indica que esta función crea una interfaz gráfica (UI) en Jetpack Compose.
fun LoginScreen(navController: NavHostController) {   //loginscreen es la función que representa la pantalla de login. navController permite cambiar de pantalla mediante rutas (por ejemplo, ir al menú principal).
    Column(  // Column: organiza todos los elementos uno debajo del otro verticalmente.
        modifier = Modifier
            .fillMaxSize()  // fillMaxSize(): hace que la columna ocupe toda la pantalla.
            .padding(16.dp) // padding(16.dp): agrega espacio interno de 16 píxeles independientes de densidad (dp) alrededor de los elementos.
    ) {
        Header()

        Spacer(modifier = Modifier.height(20.dp)) // Añade espacio vertical de 20dp entre el encabezado y el siguiente elemento.

        Text(text = "Pantalla de Login - LoginScreen")  // Muestra un texto simple como título o referencia visual de la pantalla actual.

        Spacer(modifier = Modifier.height(20.dp))  // Otro espacio para separar visualmente el botón del texto anterior.

        Button(    // Este botón no valida usuario ni contraseña, simplemente navega directamente a "main_menu" cuando se presiona.
            onClick = {
                // Navegar directamente al menú principal sin autenticación
                navController.navigate("main_menu")  // navController.navigate("main_menu"): indica que al presionar el botón, cambiará a la pantalla del menú principal.
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)), // Cambia el color del botón al amarillo dorado (#FFC107), para que tenga el estilo característico de tu app Carnales.
            modifier = Modifier.fillMaxWidth().height(50.dp)  // el boton ocupa todo el ancho de la pantalla y tiene una altura de 50dp.
        ) {
            Text(text = "Entrar al Menú") // Texto visible dentro del botón.
        }
    }
}