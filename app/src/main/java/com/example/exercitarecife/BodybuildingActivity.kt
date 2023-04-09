package com.example.exercitarecife

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class BodybuildingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bodybuilding)

        val imageHome = findViewById<ImageView>(R.id.imageViewhome)
        imageHome.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        Log.d("MusculacaoActivity", "onCreate() chamado")
    }
}
