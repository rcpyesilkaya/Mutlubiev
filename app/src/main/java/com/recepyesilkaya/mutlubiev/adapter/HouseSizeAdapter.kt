package com.recepyesilkaya.mutlubiev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recepyesilkaya.mutlubiev.R

class HouseSizeAdapter(private val houseSizeList: List<String>) :
    RecyclerView.Adapter<HouseSizeAdapter.HouseSizeViewHolder>() {
    class HouseSizeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseSizeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_house_size, parent, false)
        return HouseSizeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HouseSizeViewHolder, position: Int) {
        val house = houseSizeList[position]

        val tvProductTitle: TextView = holder.itemView.findViewById(R.id.tvProductTitle)
        tvProductTitle.text = house
    }

    override fun getItemCount(): Int {
        return houseSizeList.size
    }
}