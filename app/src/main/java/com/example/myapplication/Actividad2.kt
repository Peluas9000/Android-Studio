package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Actividad2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.actividad2_xml)

        // 1️⃣ Localizamos el TextView
        val text = findViewById<TextView>(R.id.textsaludo)
        //el getter
        val mensajeRecibido = intent.getStringExtra("Mensaje")

        //el setter de la variable recibido del getter
        text.text="$mensajeRecibido"


    }
}
