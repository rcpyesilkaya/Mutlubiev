package com.recepyesilkaya.mutlubiev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.recepyesilkaya.mutlubiev.R
import com.recepyesilkaya.mutlubiev.model.Item

class dsvAdapter(val data: ArrayList<Item>) : RecyclerView.Adapter<dsvAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (id, name, price, image) = data[position]

        val tv_name: TextView = holder.itemView.findViewById(R.id.tv_title)
        val tv_description: TextView = holder.itemView.findViewById(R.id.tv_bottom)
        val iv: ImageView = holder.itemView.findViewById(R.id.image)

        tv_name.text = name
        tv_description.text = price
        Glide.with(holder.itemView.context).load(image).into(iv)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun updateVariables(newItemList: List<Item>) {
        data.clear()
        data.addAll(newItemList)
        notifyDataSetChanged()
    }
}