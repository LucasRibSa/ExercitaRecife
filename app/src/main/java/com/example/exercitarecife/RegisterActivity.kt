package com.example.exercitarecife

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            // Aqui você pode adicionar o código para validar as entradas do usuário e salvar as informações do novo usuário.
        }
        val backToLoginButton = findViewById<Button>(R.id.backToLoginButton)
        backToLoginButton.setOnClickListener {
            finish()
        }
    }
}
