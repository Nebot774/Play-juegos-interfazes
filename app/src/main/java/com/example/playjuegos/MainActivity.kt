package com.example.playjuegos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jugador = findViewById<Button>(R.id.button1)
        jugador.setOnClickListener { lanzarNewPlayer() }
    }

    private fun lanzarNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
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
