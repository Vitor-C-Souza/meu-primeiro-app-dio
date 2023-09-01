package br.com.igorbag.meuprimeiroappdio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sum = findViewById<Button>(R.id.btn_somar)
        val multi = findViewById<Button>(R.id.btn_multi)
        val sub = findViewById<Button>(R.id.btn_sub)
        val divider = findViewById<Button>(R.id.btn_divisao)
        val n1 = findViewById<EditText>(R.id.EdTxt_number1)
        val n2 = findViewById<EditText>(R.id.EdTxt_number2)
        val result = findViewById<EditText>(R.id.EdTxt_result)

        sum.setOnClickListener {
            val numero1 = n1.text.toString()
            val numero2 = n2.text.toString()

            if(numero1.isNotEmpty() && numero2.isNotEmpty()) {
                val valor1 = numero1.toFloat()
                val valor2 = numero2.toFloat()

                val resultado = valor1 + valor2


                result.setText(resultado.toString())
            }
        }

        multi.setOnClickListener {
            val numero1 = n1.text.toString()
            val numero2 = n2.text.toString()

            if(numero1.isNotEmpty() && numero2.isNotEmpty()) {
                val valor1 = numero1.toFloat()
                val valor2 = numero2.toFloat()

                val resultado = valor1 * valor2

                result.setText(resultado.toString())
            }
        }

        sub.setOnClickListener {
            val numero1 = n1.text.toString()
            val numero2 = n2.text.toString()

            if(numero1.isNotEmpty() && numero2.isNotEmpty()) {
                val valor1 = numero1.toFloat()
                val valor2 = numero2.toFloat()

                val resultado = valor1 - valor2


                result.setText(resultado.toString())
            }
        }

        divider.setOnClickListener {
            val numero1 = n1.text.toString()
            val numero2 = n2.text.toString()

            if(numero1.isNotEmpty() && numero2.isNotEmpty()) {
                val valor1 = numero1.toFloat()
                val valor2 = numero2.toFloat()

                val resultado = valor1 / valor2


                result.setText(resultado.toString())
            }
        }
        //O desafio sera criar uma valor dentro do string.xml
        // E trocar o texto do xml e tornar internacional (Ingles, Espanhol, etc...)
    }
}