package com.example.exercitarecife

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val bodybuildingButton = findViewById<Button>(R.id.bodybuildingButton)
        bodybuildingButton.setOnClickListener {
            val intent = Intent(this, BodybuildingActivity::class.java)
            startActivity(intent)
        }

        val CardiovascularButton = findViewById<Button>(R.id.CardiovascularButton)
        CardiovascularButton.setOnClickListener {
            val intent = Intent(this, CardiovascularActivity::class.java)
            startActivity(intent)
        }
    }
}
