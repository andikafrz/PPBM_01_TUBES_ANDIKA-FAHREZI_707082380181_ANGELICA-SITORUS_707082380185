package com.example.tubesppbm

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import de.hdodenhof.circleimageview.CircleImageView


class ProfilePage : AppCompatActivity() {
    private lateinit var dialog: BottomSheetDialog

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        val btnClose = findViewById<CircleImageView>(R.id.angel)

        // Initialize the BottomSheetDialog
        dialog = BottomSheetDialog(this)
        val bottomSheetView = layoutInflater.inflate(R.layout.bottomsheet, null)
        dialog.setCancelable(false)
        dialog.setContentView(bottomSheetView)

        // Set click listener for the button to show the bottom sheet
        btnClose.setOnClickListener{
            dialog.show()
        }

        // Set click listener for the close button in the bottom sheet
        val btnBottomSheetClose = bottomSheetView.findViewById<ImageView>(R.id.tutup)
        btnBottomSheetClose.setOnClickListener{
            dialog.dismiss()
        }

        //ini andika

        val btnTutup = findViewById<CircleImageView>(R.id.andika)

        // Initialize the BottomSheetDialog
        dialog = BottomSheetDialog(this)
        val viewbottomsheet = layoutInflater.inflate(R.layout.bottomsheet1, null)
        dialog.setCancelable(false)
        dialog.setContentView(viewbottomsheet)

        // Set click listener for the button to show the bottom sheet
        btnTutup.setOnClickListener{
            dialog.show()
        }

        // Set click listener for the close button in the bottom sheet
        val btnBottomClose = viewbottomsheet.findViewById<ImageView>(R.id.tutup1)
        btnBottomClose.setOnClickListener{
            dialog.dismiss()
        }

    }
}