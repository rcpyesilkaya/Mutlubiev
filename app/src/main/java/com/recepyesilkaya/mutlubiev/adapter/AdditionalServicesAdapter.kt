package com.recepyesilkaya.mutlubiev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.recepyesilkaya.mutlubiev.R
import com.recepyesilkaya.mutlubiev.model.AdditionalServices

class AdditionalServicesAdapter(private val additionalServicesList: List<AdditionalServices>) :
    RecyclerView.Adapter<AdditionalServicesAdapter.AdditionalServicesViewHolder>() {
    class AdditionalServicesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdditionalServicesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_additional_services, parent, false)
        return AdditionalServicesViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdditionalServicesViewHolder, position: Int) {
        val aService = additionalServicesList[position]

        val tvAdditionalServicesName: TextView =
            holder.itemView.findViewById(R.id.tvAdditionalServicesName)
        val tvAdditionalServicesPrice: TextView =
            holder.itemView.findViewById(R.id.tvAdditionalServicesPrice)
        tvAdditionalServicesName.text = aService.additionalServicesName
        tvAdditionalServicesPrice.text = aService.additionalServicesPrice

    }

    override fun getItemCount(): Int {
        return additionalServicesList.size
    }
}