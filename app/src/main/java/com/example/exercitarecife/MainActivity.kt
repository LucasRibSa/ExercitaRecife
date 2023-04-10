package com.example.exercitarecife
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercitarecife.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = binding.editTextUsername
        val password = binding.editTextPassword
        val buttonRegister = binding.buttonRegister
        val buttonLogin = binding.buttonLogin

        buttonLogin.setOnClickListener {
            if (username.text.toString() == "Lucas" && password.text.toString() == "123") {
                val intent = Intent(this, MenuActivity::class.java)
                val login = username.text.toString()
                val senha = password.text.toString()
                intent.putExtra("login", login)
                intent.putExtra("senha", senha)
                startActivity(intent)
            }
                buttonRegister.setOnClickListener {
                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)
                    finish()

            }
        }
    }
}

