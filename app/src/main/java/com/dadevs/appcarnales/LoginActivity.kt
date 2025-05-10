import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Obtener referencias de los elementos de la vista
        val editCorreo = findViewById<EditText>(R.id.editCorreo)
        val editContrasena = findViewById<EditText>(R.id.editContrasena)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // Al hacer clic en el botón, se envían los datos al servidor PHP
        btnLogin.setOnClickListener {
            val correo = editCorreo.text.toString()
            val contrasena = editContrasena.text.toString()

            // Validación básica
            if (correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // URL de tu archivo PHP
            val url = "http://10.0.2.2/appcarnales_api/login.php"

            // Enviar petición POST con Volley
            val stringRequest = object : StringRequest(
                Method.POST, url,
                { response ->
                    // Convertimos el resultado a JSON
                    val jsonResponse = JSONObject(response)
                    val success = jsonResponse.getBoolean("success")
                    val message = jsonResponse.getString("message")

                    // Mostramos el mensaje
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                },
                { error ->
                    // Error en la petición
                    Toast.makeText(this, "Error: ${error.message}", Toast.LENGTH_LONG).show()
                }
            ) {
                override fun getParams(): Map<String, String> {
                    // Enviamos los parámetros del formulario al PHP
                    val params = HashMap<String, String>()
                    params["correo"] = correo
                    params["contrasena"] = contrasena
                    return params
                }
            }

            // Enviar la petición
            Volley.newRequestQueue(this).add(stringRequest)
        }
    }
}
