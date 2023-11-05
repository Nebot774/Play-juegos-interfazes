package com.example.playjuegos

import android.os.Bundle;
import android.widget.Button
import android.widget.RadioButton
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Preferences : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        // Referencias a los RadioButtons
        val angryBird = findViewById<RadioButton>(R.id.radioButton1)
        val dragonFly = findViewById<RadioButton>(R.id.radioButton2)
        val hillClimb = findViewById<RadioButton>(R.id.radioButton3)
        val pocketSoccer = findViewById<RadioButton>(R.id.radioButton4)
        val radiantDefense = findViewById<RadioButton>(R.id.radioButton5)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        ratingBar.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener { _, rating, _ ->
            // Manejar cambio de rating aquí si es necesario
        }

        val seekBar = findViewById<SeekBar>(R.id.barra)
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Manejar cambio de progreso aquí si es necesario
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Opcional: Manejar inicio de toque aquí si es necesarioa
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Opcional: Manejar fin de toque aquí si es necesario
            }
        })

        // FAB listener con Kotlin lambda
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            // Encuentra el RadioButton seleccionado
            val selectedRadioButton = when {
                angryBird.isChecked -> angryBird.text.toString()
                dragonFly.isChecked -> dragonFly.text.toString()
                hillClimb.isChecked -> hillClimb.text.toString()
                pocketSoccer.isChecked -> pocketSoccer.text.toString()
                radiantDefense.isChecked -> radiantDefense.text.toString()
                else -> "Ningún juego seleccionado"
            }

            // Muestra el RadioButton seleccionado en un Toast
            Toast.makeText(this@Preferences, selectedRadioButton, Toast.LENGTH_SHORT).show()
        }
    }
}



