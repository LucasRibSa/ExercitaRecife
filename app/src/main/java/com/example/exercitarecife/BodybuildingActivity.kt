package com.example.exercitarecife
import com.example.exercitarecife.databinding.ActivityBodybuildingBinding
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BodybuildingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBodybuildingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBodybuildingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageHome = binding.imageViewhome
        imageHome.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
