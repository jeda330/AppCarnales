package com.dadevs.appcarnales  // Indica que pertenece a tu proyecto.

import android.content.Context  // Importamos clases necesarias para layouts, colores, textos.
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class Header(context: Context) : LinearLayout(context) {   // Creamos una clase que hereda de LinearLayout (una fila horizontal).

    init {    // Código que se ejecuta apenas se crea el Header.
        orientation = HORIZONTAL  // Queremos que el header sea una fila (horizontal).
        setBackgroundColor(Color.parseColor("#FFC107")) // Color Amarillo estilo "Carnales"
        setPadding(16, 16, 16, 16)  // Le damos espacio interno alrededor.

        val daDevs = TextView(context).apply { // Creamos un texto a la izquierda, tamaño 18, color negro.
            text = "DA Devs"
            textSize = 18f
            setTextColor(Color.BLACK)
            gravity = Gravity.START
            layoutParams = LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)
        }

        val carnales = TextView(context).apply {   // Creamos un texto a la derecha, mismo estilo.
            text = "Carnales"
            textSize = 18f
            setTextColor(Color.BLACK)
            gravity = Gravity.END
            layoutParams = LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)
        }

        addView(daDevs)      // 	Agregamos los dos textos al Header.
        addView(carnales)
    }
}
