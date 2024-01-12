package com.example.tubesppbm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.tabs.TabLayout

class KeranjangPage : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter:FragmentPageAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang_page)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)
        adapter = FragmentPageAdapter(supportFragmentManager, lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("Beli"))
        tabLayout.addTab(tabLayout.newTab().setText("Hubungi"))

        viewPager2.adapter = adapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab != null){
                    viewPager2.currentItem =tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

        val imageList = ArrayList<SlideModel>() // Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://image.uniqlo.com/UQ/ST3/id/imagesgoods/455359/item/idgoods_55_455359.jpg?width=750", "1"))
        imageList.add(SlideModel("https://image.uniqlo.com/UQ/ST3/AsianCommon/imagesgoods/455359/sub/goods_455359_sub14.jpg?width=750", "2"))
        imageList.add(SlideModel("https://image.uniqlo.com/UQ/ST3/AsianCommon/imagesgoods/455359/sub/goods_455359_sub18.jpg?width=750", "3"))
        imageList.add(SlideModel("https://image.uniqlo.com/UQ/ST3/AsianCommon/imagesgoods/455359/sub/goods_455359_sub17.jpg?width=750", "4"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_sliderkeranjang)
        imageSlider.setImageList(imageList)

    }
}