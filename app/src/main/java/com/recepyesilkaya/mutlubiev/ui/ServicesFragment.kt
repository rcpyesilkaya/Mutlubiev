package com.recepyesilkaya.mutlubiev.ui

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recepyesilkaya.mutlubiev.R
import com.recepyesilkaya.mutlubiev.adapter.AdditionalServicesAdapter
import com.recepyesilkaya.mutlubiev.adapter.HouseSizeAdapter
import com.recepyesilkaya.mutlubiev.mock.mock
import java.util.*


class ServicesFragment : Fragment() {

    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val day = calendar.get(Calendar.DAY_OF_MONTH)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_services, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val rvHouseSize: RecyclerView = view.findViewById(R.id.rvHouseSize)
        val rvAdditionalServices: RecyclerView = view.findViewById(R.id.rvAdditionalServices)
        val spinnerCity: Spinner = view.findViewById(R.id.spinnerCity)
        val spinnerDistrict: Spinner = view.findViewById(R.id.spinnerDistrict)
        val cvCalendar: CardView = view.findViewById(R.id.cvCalendar)

        val cityList: MutableList<String> = mutableListOf("Ankara", "İstanbul", "İzmir")
        val adapterCity = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, cityList)
        adapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCity.adapter = adapterCity

        val districtList: MutableList<String> = mutableListOf("İlçe Seçiniz", "Ataşehir", "Avcılar")
        val adapterDistrict = ArrayAdapter(
            view.context,
            android.R.layout.simple_spinner_item,
            districtList
        )
        adapterDistrict.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDistrict.adapter = adapterDistrict

        rvHouseSize.adapter = HouseSizeAdapter(mock.getHouseSize())
        rvHouseSize.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        rvAdditionalServices.adapter = AdditionalServicesAdapter(mock.getAdditionalServices())
        rvAdditionalServices.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        cvCalendar.setOnClickListener {
            openCalendar(view.context)
        }
    }

    fun openCalendar(context: Context) {
        val datePickerDialog = DatePickerDialog(
            context, DatePickerDialog.OnDateSetListener
            { view, year, monthOfYear, dayOfMonth ->

            }, year, month, day
        )
        datePickerDialog.show()
    }
}