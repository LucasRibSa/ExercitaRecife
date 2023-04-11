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

        val buttonRegister = binding.buttonRegister
        val buttonLogin = binding.buttonLogin

        buttonLogin.setOnClickListener {

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        buttonRegister.setOnClickListener {
                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)
        }
    }
}


