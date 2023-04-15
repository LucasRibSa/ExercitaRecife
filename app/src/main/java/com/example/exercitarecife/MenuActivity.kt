package com.example.exercitarecife
import com.example.exercitarecife.databinding.ActivityMenuBinding
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuarioNome =binding.msgUsuario
        val nome = intent.getStringExtra("nome")
        if (usuarioNome != null) {
            usuarioNome.text = nome
        }
        val bodybuildingButton = binding.bodybuildingButton
        bodybuildingButton.setOnClickListener {
            val intent = Intent(this, BodybuildingActivity::class.java)
            startActivity(intent)
        }

        val cardiovascularButton = binding.cardiovascularButton
        cardiovascularButton.setOnClickListener {
            val intent = Intent(this, CardiovascularActivity::class.java)
            startActivity(intent)
        }
    }
}
