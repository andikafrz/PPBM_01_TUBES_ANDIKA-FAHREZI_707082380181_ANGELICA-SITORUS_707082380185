package com.example.tubesppbm
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class NotifikasiListViewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi_list_view_page)

        var listView = findViewById<ListView>(R.id.ListNotif)
        var list = mutableListOf<Notif>()

        list.add(Notif("Promo", "Nikmati Promo Pembelian Cowok Ganteng sepuasmu", R.drawable.diskon))
        list.add(Notif("Live & Video", "CO Live lebih murah", R.drawable.video))
        list.add(Notif("Keuangan", "Harga Emas lagi turun", R.drawable.money2))
        list.add(Notif("AAGames", "Bonus Tahun baru siap dikirim", R.drawable.game))

        listView.adapter = NotifAdapter(this, R.layout.list_notif, list)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Promo Keren", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Promo Keren", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Promo Keren", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Promo Keren", Toast.LENGTH_SHORT).show()
            }
        }
    }
}