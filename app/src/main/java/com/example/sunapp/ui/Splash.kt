package com.example.sunapp.ui

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.sunapp.R
import com.example.sunapp.base.BaseActivity
import com.example.sunapp.ui.dashboard.DashboardActivity
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*

class Splash : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val animation: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.animated)
        IV_splash1.startAnimation(animation)
        val task: TimerTask = object : TimerTask() {
            override fun run() {
                launchHomeScreen()
            }
        }
        val t = Timer()
        t.schedule(task, 5000)
    }

    private fun launchHomeScreen() {
        navigateTo(DashboardActivity::class.java, null, true)
        finish()
    }
}