package com.example.playjuegos

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jugador = findViewById<Button>(R.id.button1)
        jugador.setOnClickListener { lanzarNewPlayer() }
        val preferense=findViewById<Button>(R.id.button3)
        preferense.setOnClickListener{lanzarPreferences()}
        val games=findViewById<Button>(R.id.button2)
        games.setOnClickListener{lanzarGames()}
        val about=findViewById<Button>(R.id.button4)
        about.setOnClickListener{lanzarAbout()}

    }

    private fun lanzarAbout() {
        val i = Intent(this, about::class.java)
        startActivity(i)
    }

    private fun lanzarNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    private fun lanzarPreferences() {
        val i = Intent(this, Preferences::class.java)
        startActivity(i)
    }

    private fun lanzarGames(){
        val i = Intent(this, Games::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_search) {
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show()
            // Acción a realizar cuando se hace clic en "action_search"
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
