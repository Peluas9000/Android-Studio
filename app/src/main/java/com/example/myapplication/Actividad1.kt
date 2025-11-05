package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Actividad1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edit=findViewById<EditText>(R.id.editFrase)
        val boton=findViewById<Button>(R.id.saludo_button)

        boton.setOnClickListener {
            val intent= Intent(this, Actividad2::class.java)
           //este es la f(X) que hace que el putExtra lea el mensaje
            intent.putExtra("Mensaje",edit.text.toString())
            startActivity(intent)

        }

    }







}