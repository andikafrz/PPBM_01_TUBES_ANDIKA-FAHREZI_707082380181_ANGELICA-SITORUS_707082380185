package com.example.asessment2baru

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.example.asessment2baru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.mercury,
            R.drawable.venus,
            R.drawable.earth,
            R.drawable.mars,
            R.drawable.jupiter,
            R.drawable.saturn,
            R.drawable.uranus,
            R.drawable.neptune,
        )
        val descList = intArrayOf(
            R.string.pastaDesc,
            R.string.maggieDesc,
            R.string.cakeDesc,
            R.string.pancakeDesc,
            R.string.pizzaDesc,
            R.string.burgerDesc,
            R.string.friesDesc
        )
        val nameList = arrayOf("Mercury", "Venus", "Earth", "Mars", "jupiter", "Saturn", "Uranus", "Neptune")
        val numberList = arrayOf("1", "2", "3", "4", "5", "6", "7", "8")
        for (i in imageList.indices) {
            listData = ListData(
                nameList[i],
                numberList[i], descList[i], imageList[i]
            )
            dataArrayList.add(listData)
        }
        listAdapter = ListAdapter(this@MainActivity, dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true
        binding.listview.onItemClickListener = OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@MainActivity, DetailedActivity::class.java)
            intent.putExtra("name", nameList[i])
            intent.putExtra("number", numberList[i])
            intent.putExtra("desc", descList[i])
            intent.putExtra("image", imageList[i])
            startActivity(intent)
        }
    }
}