package com.example.tubesppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val clicklink_register = findViewById<TextView>(R.id.clicklinkregister)
        clicklink_register.setOnClickListener{
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)

        }

        val btnlogin = findViewById<Button>(R.id.btn_login)
        btnlogin.setOnClickListener{
            val Intent = Intent(this, HomePageActivity::class.java)
            startActivity(Intent)

        }

    }
}