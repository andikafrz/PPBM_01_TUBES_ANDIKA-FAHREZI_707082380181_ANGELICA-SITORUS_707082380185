package com.example.asessment2baru

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.asessment2baru.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val number = intent.getStringExtra("number")
            val desc = intent.getIntExtra("desc", R.string.detailDesc)
            val image = intent.getIntExtra("image", R.drawable.mercury)

            binding.detailName.text = name
            binding.detailNumber.text = number
            binding.detailDesc.setText(desc)
            binding.detailImage.setImageResource(image)
        }
    }
}