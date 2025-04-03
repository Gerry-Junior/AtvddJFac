package com.example.atividdfacuj

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun voltarInicio(view: View) {
        val inicio = Intent(this, IniciarAtividades::class.java)
        startActivity(inicio)
    }

    fun abrirGit(view: View){
        val git = Uri.parse("https://github.com/Gerry-Junior")
        val inicia = Intent(Intent.ACTION_VIEW, git)
        startActivity(inicia)
    }
    fun abrirInsta(view: View){
        val git = Uri.parse("https://www.instagram.com/gerry.csl/")
        val inicia = Intent(Intent.ACTION_VIEW, git)
        startActivity(inicia)
    }
}