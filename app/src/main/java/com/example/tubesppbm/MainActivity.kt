package com.example.tubesppbm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.ncorti.slidetoact.SlideToActView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val slide_gettingstarted = findViewById<SlideToActView>(R.id.nextslidepage)
        slide_gettingstarted.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener{
            override fun onSlideComplete(view: SlideToActView) {
                val _intent = Intent(this@MainActivity, LoginRegisterActivity::class.java)
                startActivity(_intent)
            }

        }
    }
}