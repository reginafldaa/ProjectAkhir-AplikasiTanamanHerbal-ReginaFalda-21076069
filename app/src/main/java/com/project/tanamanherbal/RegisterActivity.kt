package com.project.tanamanherbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    private lateinit var btnRegister : Button
    private lateinit var btnCancel : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister = findViewById(R.id.R_btn1)
        btnCancel = findViewById(R.id.cancelButton)

        btnRegister.setOnClickListener{
            val move = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(move)
        }

        btnCancel.setOnClickListener{
            val move = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(move)
        }
    }

}