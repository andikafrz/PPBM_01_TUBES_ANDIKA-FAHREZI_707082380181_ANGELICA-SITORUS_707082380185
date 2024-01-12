package com.example.tubesppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val clicklink_login = findViewById<TextView>(R.id.clicklinklogin)
        clicklink_login.setOnClickListener{
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)

        }
    }
}