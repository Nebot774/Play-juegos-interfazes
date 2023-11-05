package com.example.playjuegos

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.playjuegos.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Games : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        val angryBird = findViewById<CheckBox>(R.id.botoAngryBird)
        val dragonFly = findViewById<CheckBox>(R.id.dragonFly)
        val boHillClimb = findViewById<CheckBox>(R.id.botoHillClimbing)
        val botoRadiantDefense = findViewById<CheckBox>(R.id.botoRadiantDefense)
        val botoPocketSoccer = findViewById<CheckBox>(R.id.botoPocketSoccer)
        val botoNinjaJump = findViewById<CheckBox>(R.id.botoNinjaJump)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            // Crear una lista para almacenar los juegos seleccionados
            val selectedGames = mutableListOf<String>()

            if (angryBird.isChecked) selectedGames.add(angryBird.text.toString())
            if (dragonFly.isChecked) selectedGames.add(dragonFly.text.toString())
            if (boHillClimb.isChecked) selectedGames.add(boHillClimb.text.toString())
            if (botoRadiantDefense.isChecked) selectedGames.add(botoRadiantDefense.text.toString())
            if (botoPocketSoccer.isChecked) selectedGames.add(botoPocketSoccer.text.toString())
            if (botoNinjaJump.isChecked) selectedGames.add(botoNinjaJump.text.toString())

            // Preparar el mensaje a mostrar
            val message = if (selectedGames.isNotEmpty()) {
                "Juegos seleccionados: ${selectedGames.joinToString(", ")}"
            } else {
                "Ningún juego seleccionado"
            }

            // Mostrar el mensaje en un Toast
            Toast.makeText(this@Games, message, Toast.LENGTH_SHORT).show()
        }
    }
}
