package com.recepyesilkaya.mutlubiev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recepyesilkaya.mutlubiev.R
import com.recepyesilkaya.mutlubiev.model.Campaing

class CampaingAdapter(private var campaingList: List<Campaing>) :
    RecyclerView.Adapter<CampaingAdapter.CampaingViewHolder>() {

    class CampaingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampaingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_campaign, parent, false)
        return CampaingViewHolder(view)

    }

    override fun onBindViewHolder(holder: CampaingViewHolder, position: Int) {
        val campaing = campaingList[position]

        val tvTitleCampaing: TextView = holder.itemView.findViewById(R.id.tvTitleCampaing)
        val ivCampaing: ImageView = holder.itemView.findViewById(R.id.ivCampaing)

        tvTitleCampaing.text = campaing.title
        ivCampaing.setImageResource(campaing.image)
    }

    override fun getItemCount(): Int {
        return campaingList.size
    }

}