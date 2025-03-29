package com.example.atividdfacuj

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TarefaImc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tarefa_imc)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun CalcularImc(view: View){
        val btn: TextView = findViewById(R.id.botaoCalc)
        val entradaNome: EditText = findViewById(R.id.idNome)
        val entradaIdade: EditText = findViewById(R.id.idIdade)

        val entradaPeso:EditText = findViewById(R.id.entradaPeso)
        val entradaAltura:EditText = findViewById(R.id.entradaAltura)

        val valor1 = entradaPeso.text.toString().toDouble()
        val valor2 = entradaAltura.text.toString().toDouble()

        val txtResNome:TextView = findViewById(R.id.idResNome)
        val txtResIdade:TextView = findViewById(R.id.idResIdade)
        val txtRespota:TextView = findViewById(R.id.resCalculoImc)
        val txtclasImc:TextView = findViewById(R.id.classImc)

        val calculo = valor1/Math.pow(valor2,2.0)

        if (calculo < 18.5 ){
            txtResNome.setText(String.format("Nome: %s",entradaNome.text.toString()))
            txtResIdade.setText(String.format("Idade: %s",entradaIdade.text.toString()))
            txtRespota.setText(String.format("IMC de 18,5: %.2f", calculo))
            txtclasImc.setText("Classificação: ABAIXO DO NORMAL")
        }else if (calculo in 18.5..24.9){
            txtResNome.setText(String.format("Nome: %s",entradaNome.text.toString()))
            txtResIdade.setText(String.format("Idade: %s",entradaIdade.text.toString()))
            txtRespota.setText(String.format("IMC de 18,6 e 24,9: %.2f",calculo))
            txtclasImc.setText("Classificação: NORMAL")
        }else if (calculo in 25.0..29.9){
            txtResNome.setText(String.format("Nome: %s",entradaNome.text.toString()))
            txtResIdade.setText(String.format("Idade: %s",entradaIdade.text.toString()))
            txtRespota.setText(String.format("IMC de 25,0 e 29,9: %.2f",calculo))
            txtclasImc.setText("Classificação: SOBREPESO")
        }else if (calculo in 30.0..34.9){
            txtResNome.setText(String.format("Nome: %s",entradaNome.text.toString()))
            txtResIdade.setText(String.format("Idade: %s",entradaIdade.text.toString()))
            txtRespota.setText(String.format("IMC de 30.0 e 34.9:  %.2f",calculo))
            txtclasImc.setText("Classificação: OBESIDADE GRAU I")
        }else if (calculo in 35.0..39.9){
            txtResNome.setText(String.format("Nome: %s",entradaNome.text.toString()))
            txtResIdade.setText(String.format("Idade: %s",entradaIdade.text.toString()))
            txtRespota.setText(String.format("IMC de 35.0 e 39.9:  %.2f",calculo))
            txtclasImc.setText("Classificação: OBESIDADE GRAU II")
        }else{
            txtResNome.setText(String.format("Nome: %s",entradaNome.text.toString()))
            txtResIdade.setText(String.format("Idade: %s",entradaIdade.text.toString()))
            txtRespota.setText(String.format("IMC acima de 40.0:  %.2f",calculo))
            txtclasImc.setText("Classificação: OBESIDADE GRAU III")
        }
    }

    fun voltarInicio(view: View){
        val inicio = Intent(this,IniciarAtividades::class.java)
        startActivity(inicio)
    }
}