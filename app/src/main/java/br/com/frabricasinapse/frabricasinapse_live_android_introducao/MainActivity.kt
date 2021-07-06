package br.com.frabricasinapse.frabricasinapse_live_android_introducao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
//        tvResultado.text = "Texto Alterado!!"
        val etNome = findViewById<EditText>(R.id.etNome)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        btEnviar.setOnClickListener {
            if (etNome.text.isNotBlank()) {
                tvResultado.text = "Olá, ${etNome.text}!"
            }
            else {
                etNome.error = "Você não digitou um nome!"
            }

        }

    }
}