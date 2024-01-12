package com.example.tubesppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import de.hdodenhof.circleimageview.CircleImageView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val imageList = ArrayList<SlideModel>() // Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://d1csarkz8obe9u.cloudfront.net/posterpreviews/online-fashion-sale-banner-template-design-cc34c2027d0bb5ccc2ff90231abaa242_screen.jpg?ts=1613395464", "Bro sedang menggigit medali"))
        imageList.add(SlideModel("https://s3.amazonaws.com/thumbnails.venngage.com/template/d2cf846a-5fee-4013-bd39-d1b1ca1c3510.png", "Bro sedang membenarkan Topi Wisuda"))
        imageList.add(SlideModel("https://media.gq.com/photos/62169735c3bb3e8774cb8802/master/pass/uniqlo.jpg", "Bro sedang melempar topi wisudanya"))
        imageList.add(SlideModel("https://media.gq.com/photos/651dd76a98610bc5e226e685/3:2/w_1686,h_1124,c_limit/uniqlo-art.jpg", "huheheehehe"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        //dibawah ini insialisasi untuk keranjang

        val click_keranjang = findViewById<ImageView>(R.id.click_keranjang)
        click_keranjang.setOnClickListener{
            val Intent = Intent(this, KeranjangPage::class.java)
            startActivity(Intent)

        }

        val click_notif = findViewById<ImageView>(R.id.notif)
        click_notif.setOnClickListener{
            val Intent = Intent(this, NotifikasiListViewPage::class.java)
            startActivity(Intent)

        }

        val click_profile = findViewById<CircleImageView>(R.id.profile_image)
        click_profile.setOnClickListener{
            val Intent = Intent(this, ProfilePage::class.java)
            startActivity(Intent)

        }

    }
}