package com.example.sunnewsapp.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.sunnewsapp.base.BaseActivity
import com.example.sunnewsapp.database.model.MyData
import com.example.sunnewsapp.databinding.ActivityProfileBinding
import com.example.sunnewsapp.ui.adapter.ProfileDataAdapter
import com.example.sunnewsapp.ui.dashboard.DashboardActivity
import com.example.sunnewsapp.ui.dashboard.DashboardViewModel
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener


class ProfileActivity : BaseActivity() {

    private var _binding: ActivityProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var myAdapter: ProfileDataAdapter
    private var profileNAME :String ?= null
    private var profileID :String ?= null
    private var profileDESCRIPTION :String ?= null
    private var profileVIDEO :String ?= null
    private lateinit var dashboardViewModel: DashboardViewModel


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bundle = intent.extras
        profileNAME = bundle?.getString("Bname")
        profileID = bundle?.getInt("Bid",0).toString()
        profileDESCRIPTION = bundle?.getString("Bdescription")
        profileVIDEO = bundle?.getString("Bvideo")

        binding.tvID.text = "$profileNAME\nTrailer"
        binding.nameTxt.text = profileNAME
        binding.DescriptionTxt.text = profileDESCRIPTION

        dashboardViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
        dashboardViewModel.init()
        dashboardViewModel.isDataCallCompleted.observe(this) {
            callAdapter(it)
        }

        videoPlay()

        binding.IVBack.setOnClickListener {
            navigateTo(DashboardActivity::class.java, null, true)
        }
    }

    private fun videoPlay(){
        lifecycle.addObserver(binding. videoView)
        binding.videoView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = profileVIDEO
                youTubePlayer.cueVideo(videoId!!, 0f)
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun callAdapter(item: List<MyData>) {
        myAdapter = ProfileDataAdapter( item)
        binding.dashBoardRecycler.adapter = myAdapter
        binding.dashBoardRecycler.apply {
            set3DItem(true)
            setAlpha(true)
            setInfinite(true)
        }
        myAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onBackPressed() {
        navigateTo(DashboardActivity::class.java, null, true)
    }
}