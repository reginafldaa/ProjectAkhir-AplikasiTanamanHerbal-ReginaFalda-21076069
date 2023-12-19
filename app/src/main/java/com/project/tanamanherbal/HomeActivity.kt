package com.project.tanamanherbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    private lateinit var btnExplore : Button
    private lateinit var btnProfile : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnExplore = findViewById(R.id.btn_menu)
        btnProfile = findViewById(R.id.btn_profile)

        btnExplore.setOnClickListener {
            val move = Intent(this@HomeActivity, MenuActivity::class.java)
            startActivity(move)
        }

        btnProfile.setOnClickListener {
            val move = Intent(this@HomeActivity, ProfileActivity::class.java)
            startActivity(move)
        }
    }
}