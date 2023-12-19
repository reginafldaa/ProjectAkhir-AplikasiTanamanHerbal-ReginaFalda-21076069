package com.project.tanamanherbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    private lateinit var Edit: Button
    private lateinit var Logout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Edit = findViewById(R.id.btnEditProfile)
        Logout = findViewById(R.id.btnLogout)

        Edit.setOnClickListener {
            val move = Intent(this@ProfileActivity, EditProfileActivity::class.java)
            startActivity(move)
        }

        Logout.setOnClickListener {
            val move = Intent(this@ProfileActivity, MainActivity::class.java)
            startActivity(move)
        }
    }
}