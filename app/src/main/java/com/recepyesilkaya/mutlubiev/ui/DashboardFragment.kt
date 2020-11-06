package com.recepyesilkaya.mutlubiev.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.recepyesilkaya.mutlubiev.R
import com.recepyesilkaya.mutlubiev.adapter.CampaingAdapter
import com.recepyesilkaya.mutlubiev.adapter.dsvAdapter
import com.recepyesilkaya.mutlubiev.mock.mock
import com.recepyesilkaya.mutlubiev.model.Item
import com.yarolegovich.discretescrollview.DSVOrientation
import com.yarolegovich.discretescrollview.DiscreteScrollView
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter
import com.yarolegovich.discretescrollview.transform.ScaleTransformer


class DashboardFragment : Fragment(),
    DiscreteScrollView.OnItemChangedListener<dsvAdapter.ViewHolder>,
    View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        discreteScrollViewLoader()

        val rvCampaign: RecyclerView = view.findViewById(R.id.rvCampaign)
        val ivProductHome: ImageView = view.findViewById(R.id.ivProductHome)
        val swipeRefresh: SwipeRefreshLayout = view.findViewById(R.id.swipeRefresh)

        rvCampaign.adapter = CampaingAdapter(mock.getCampaing())
        rvCampaign.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        ivProductHome.setOnClickListener {
            val action = DashboardFragmentDirections.actionHomePageFragmentToServicesFragment()
            Navigation.findNavController(it).navigate(action)
        }

        swipeRefresh.setOnRefreshListener {
            swipeRefresh.isRefreshing = false

        }

    }

    private fun discreteScrollViewLoader() {
        val itemPicker: DiscreteScrollView? = view?.findViewById(R.id.itemPicker)
        itemPicker?.let {
            it.setOrientation(DSVOrientation.HORIZONTAL)
            itemPicker.addOnItemChangedListener(this)
            val infiniteAdapter: InfiniteScrollAdapter<*>? = InfiniteScrollAdapter.wrap(
                dsvAdapter(
                    mock.getDataEasy() as ArrayList<Item>
                )
            )
            itemPicker.adapter = infiniteAdapter
            itemPicker.setItemTransformer(
                ScaleTransformer.Builder()
                    .setMinScale(0.8f)
                    .build()
            )
        }
        val itemPicker2: DiscreteScrollView? = view?.findViewById(R.id.itemPicker2)
        itemPicker2?.let {
            it.setOrientation(DSVOrientation.HORIZONTAL)
            itemPicker2.addOnItemChangedListener(this)
            val infiniteAdapter: InfiniteScrollAdapter<*>? = InfiniteScrollAdapter.wrap(
                dsvAdapter(mock.getDataWhy() as ArrayList<Item>)
            )
            itemPicker2.adapter = infiniteAdapter
            itemPicker2.setItemTransformer(
                ScaleTransformer.Builder()
                    .setMinScale(0.8f)
                    .build()
            )
        }
    }

    override fun onCurrentItemChanged(viewHolder: dsvAdapter.ViewHolder?, adapterPosition: Int) {

    }

    override fun onClick(p0: View?) {

    }
}