package com.example.exercitarecife
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val buttonRegister = findViewById<Button>(R.id.buttonRegister)
            val buttonLogin = findViewById<Button>(R.id.buttonLogin)

            buttonLogin.setOnClickListener {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            }
            buttonRegister.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
