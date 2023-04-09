package com.example.exercitarecife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
            val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
            val buttonLogin = findViewById<Button>(R.id.buttonLogin)

            buttonLogin.setOnClickListener {
                val username = editTextUsername.text.toString()
                val password = editTextPassword.text.toString()
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    fun registerUser(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }


}
