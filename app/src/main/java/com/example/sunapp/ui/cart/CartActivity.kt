package com.example.sunapp.ui.cart

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.sunapp.base.BaseActivity
import com.example.sunapp.ui.adapter.HomeDataAdapter
import com.example.sunapp.database.model.MyData
import com.example.sunapp.databinding.ActivityCartBinding
import com.example.sunapp.ui.dashboard.DashboardActivity
import com.example.sunapp.ui.dashboard.DashboardViewModel
import com.example.sunapp.ui.listener.DataClickListener
import com.example.sunapp.ui.profile.ProfileActivity

class CartActivity : BaseActivity() {

    private var _binding: ActivityCartBinding? = null
    private val binding get() = _binding!!
    private lateinit var myAdapter: HomeDataAdapter
    private var bundle2 = Bundle()
    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCartBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_cart)

        dashboardViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
        dashboardViewModel.init()

        dashboardViewModel.isDataCallCompleted.observe(this) {
            callAdapter(it)
        }

        binding.IVBack.setOnClickListener {
            navigateTo(DashboardActivity::class.java, null, true)
        }
    }

    private fun callAdapter(item: List<MyData>) {
        myAdapter = HomeDataAdapter(this, item, object : DataClickListener {
            override fun onItemClickListener(position: Int, inputValues: String, toString: String, toString1: String) {
                when (toString) {
                    "Plus" -> {
                        Toast.makeText(this@CartActivity,  item[position].name.toString() +" is shortlisted!!", Toast.LENGTH_SHORT).show()
                    }
                    "Minus" -> {
                        Toast.makeText(this@CartActivity,  item[position].name.toString() +" is removed from your list", Toast.LENGTH_SHORT).show()
                    }
                    else -> {
                        bundleData(position)
                      //  navigateTo(ProfileActivity::class.java, null, true)
                    }
                }
            }
        })
        binding.dashBoardRecycler.adapter = myAdapter
        myAdapter.notifyDataSetChanged()
    }

    private fun bundleData(position: Int) {
        dashboardViewModel.isDataCallCompleted.observe(this) {
            bundle2.putInt("Bid", it[position].id!!)
            bundle2.putString("Bname", it[position].name!!)
            bundle2.putString("Bdescription", it[position].description!!)
            bundle2.putString("Bvideo", it[position].video!!)
        }
        navigateTo(ProfileActivity::class.java, bundle2, true)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onBackPressed() {
        navigateTo(DashboardActivity::class.java, null, true)
    }
}