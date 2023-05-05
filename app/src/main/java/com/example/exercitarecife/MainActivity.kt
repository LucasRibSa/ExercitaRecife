package com.example.exercitarecife
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercitarecife.databinding.ActivityMainBinding
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonRegister = binding.buttonRegister
        val buttonLogin = binding.buttonLogin
        val nomeLogin = binding.nameLogin

        buttonLogin.setOnClickListener {
            /// teste do banco
            val database = Firebase.database
            val myRef = database.getReference("message")
            myRef.setValue("Hello, World!")
            //teste banco

            if (nomeLogin?.text.toString()=="Lucas") {
                val intent = Intent(this, MenuActivity::class.java)
                val nome = nomeLogin?.text.toString()
                intent.putExtra("nome", nome)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }
        buttonRegister.setOnClickListener {
                    val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)
        }
    }
}


