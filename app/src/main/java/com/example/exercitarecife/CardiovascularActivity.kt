package com.example.exercitarecife
import com.example.exercitarecife.databinding.ActivityCardiovascularBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CardiovascularActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardiovascularBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardiovascularBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageCardio = binding.imageViewhome
        imageCardio.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)

        }
    }
}