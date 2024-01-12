package com.example.tubesppbm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class NotifAdapter(var mContext: Context, var resources: Int, var items:List<Notif>): ArrayAdapter<Notif>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater= LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.photo)
        val namaDiskon: TextView = view.findViewById(R.id.namanotif)
        val deskripsi: TextView = view.findViewById(R.id.deskripsi)

        var mItem:Notif = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        namaDiskon.text = mItem.nama
        deskripsi.text = mItem.deskripsi

        return view
    }
}