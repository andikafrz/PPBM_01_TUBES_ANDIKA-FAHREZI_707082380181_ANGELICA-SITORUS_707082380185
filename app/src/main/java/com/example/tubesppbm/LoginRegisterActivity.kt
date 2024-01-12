package com.example.tubesppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ncorti.slidetoact.SlideToActView

class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)

        val btn_login = findViewById<Button>(R.id.nextloginpage)
        btn_login.setOnClickListener{
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)

        }

        val btn_register = findViewById<Button>(R.id.nextregisterpage)
        btn_register.setOnClickListener{
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)

        }
    }
}