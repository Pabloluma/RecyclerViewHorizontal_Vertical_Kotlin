package com.pablo.recyclerviewhyv_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class segunda : AppCompatActivity() {
    lateinit var fotoPerfil:ImageView
    lateinit var nombrePerfil:TextView
    lateinit var descipcionPerfil:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        var intents:Intent = intent
        var fotos = intents.getIntExtra("foto",-1)
        var nombres = intents.getStringExtra("nombre")
        var descripciones = intents.getStringExtra("descripcion")
        fotoPerfil = findViewById(R.id.profile_image)
        nombrePerfil = findViewById(R.id.profile_name)
        descipcionPerfil = findViewById(R.id.textView3)
        fotoPerfil.setImageResource(fotos)
        nombrePerfil.text = nombres
        descipcionPerfil.text = descripciones

    }
}