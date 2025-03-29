package com.example.atividdfacuj

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IniciarAtividades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iniciar_atividades)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun abrirImc(view: View) {
            val entradaImc = Intent(this, TarefaImc::class.java)
            startActivity(entradaImc)
        }
    fun abrirMediaNota(view: View){
        val entradaMediAluno = Intent(this, CalcularNotaAluno::class.java)
        startActivity(entradaMediAluno)

    }
}