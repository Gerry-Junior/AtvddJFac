package com.example.atividdfacuj

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalcularNotaAluno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calcular_nota_aluno)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcularMediaAln(view: View){
        val materiaAln:Spinner = findViewById(R.id.escolhaMateria1)
        val notaAln1:TextView = findViewById(R.id.valorNota1)
        val notaAln2:TextView = findViewById(R.id.valorNota1)
        val notaAln3:TextView = findViewById(R.id.valorNota1)

        val nota1 = notaAln1.text.toString().toDouble()
        val nota2 = notaAln2.text.toString().toDouble()
        val nota3 = notaAln3.text.toString().toDouble()

        val mediaNotas = (nota1+nota2+nota3)/3

        val txtres1:TextView = findViewById(R.id.txtres1)
        val txtres2:TextView = findViewById(R.id.txtsituacao)

        if (mediaNotas >=6){
            txtres1.setText(String.format("Sua média foi: %.2f",mediaNotas))
            txtres2.setText("Aprovado!")
        }else{
            txtres1.setText(String.format("Sua média foi: %.2f",mediaNotas))
            txtres2.setText("Reprovado!")
        }


    }
    fun voltarInicio(view: View) {
        val inicio = Intent(this, IniciarAtividades::class.java)
        startActivity(inicio)
    }
}