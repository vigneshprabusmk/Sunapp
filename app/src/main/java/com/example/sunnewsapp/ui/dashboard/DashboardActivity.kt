package com.example.sunnewsapp.ui.dashboard

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sunnewsapp.base.BaseActivity
import com.example.sunnewsapp.database.model.Heroins
import com.example.sunnewsapp.database.model.Heros
import com.example.sunnewsapp.database.model.MyData
import com.example.sunnewsapp.databinding.ActivityDashboardBinding
import com.example.sunnewsapp.ui.adapter.DashBoardDataAdapter
import com.example.sunnewsapp.ui.adapter.ProfileDataAdapter1
import com.example.sunnewsapp.ui.adapter.ProfileDataAdapter2
import com.example.sunnewsapp.ui.cart.CartActivity
import com.example.sunnewsapp.ui.listener.DataClickListener
import com.example.sunnewsapp.ui.profile.ProfileActivity

class DashboardActivity : BaseActivity() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: ActivityDashboardBinding? = null
    private val binding get() = _binding!!
    lateinit var myAdapter: DashBoardDataAdapter
    lateinit var myAdapter1: ProfileDataAdapter1
    lateinit var myAdapter2: ProfileDataAdapter2
    private var bundle1 = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        dashboardViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
        dashboardViewModel.init()

        dashboardViewModel.isDataCallCompleted.observe(this) {
            loadRecyclerview(it)
        }
        dashboardViewModel.isHeroDataCallCompleted.observe(this) {
            callartistAdapter1(it)
        }
        dashboardViewModel.isHeroinDataCallCompleted.observe(this) {
            callartistAdapter2(it)
        }
        binding.IVCart.setOnClickListener {
            navigateTo(CartActivity::class.java, null, true)
        }
    }

    private fun loadRecyclerview(all: List<MyData>) {
        val verticalLayoutManager = LinearLayoutManager(this)
        verticalLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.RVDashBoardRecycler.layoutManager = verticalLayoutManager
        cartcount(all)
        callAdapter(all)
    }

    private fun callAdapter(item: List<MyData>) {
        myAdapter = DashBoardDataAdapter(this, item, object : DataClickListener {
            override fun onItemClickListener(position: Int, inputValues: String, toString: String, toString1: String) {
                bundleData(position)
            }
        })
        binding.RVDashBoardRecycler.adapter = myAdapter
        binding.RVDashBoardRecycler.apply {
            set3DItem(true)
            setAlpha(true)
            setInfinite(true)
        }
        myAdapter.notifyDataSetChanged()
    }

    private fun callartistAdapter1(item: List<Heros>) {
        myAdapter1 = ProfileDataAdapter1(item)
        val HorizontalLayout = LinearLayoutManager(this@DashboardActivity, LinearLayoutManager.HORIZONTAL,false)
        binding.RVDashBoardRecyclerhero.layoutManager = HorizontalLayout
        binding.RVDashBoardRecyclerhero.adapter = myAdapter1
        binding.RVDashBoardRecyclerhero.apply {
            set3DItem(true)
            setAlpha(true)
            setInfinite(true)
        }
        myAdapter1.notifyDataSetChanged()
    }

    private fun callartistAdapter2(item: List<Heroins>) {
        myAdapter2 = ProfileDataAdapter2(item)
        val HorizontalLayout = LinearLayoutManager(this@DashboardActivity, LinearLayoutManager.HORIZONTAL,false)
        binding.RVDashBoardRecyclerheroin.layoutManager = HorizontalLayout
        binding.RVDashBoardRecyclerheroin.adapter = myAdapter2
        binding.RVDashBoardRecyclerheroin.apply {
            set3DItem(true)
            setAlpha(true)
            setInfinite(true)
        }
        myAdapter2.notifyDataSetChanged()
    }

    private fun bundleData(position: Int) {
        dashboardViewModel.isDataCallCompleted.observe(this) {
        bundle1.putInt("Bid", it[position].id!!)
        bundle1.putString("Bname", it[position].name!!)
        bundle1.putString("Bdescription", it[position].description!!)
        bundle1.putString("Bvideo", it[position].video!!)
    }
        navigateTo(ProfileActivity::class.java, bundle1, true)
    }

    @SuppressLint("SetTextI18n")
    private fun cartcount(item:List<MyData>) {
        binding.tvCartCount.text = item.size.toString()+" news"
        callAdapter(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}