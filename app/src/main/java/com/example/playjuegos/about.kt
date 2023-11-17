package com.example.playjuegos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class about : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        // Datos de ejemplo
        val itemList = listOf("Acción", "Aventura", "Deporte","Disparos","Estrategia","Lucha","Musical","Rol","Simulacion")

        // Configuración del RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewPlataformas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = GenerosAdapter(itemList)
    }
}