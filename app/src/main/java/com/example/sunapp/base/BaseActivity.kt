package com.example.sunapp.base

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sunapp.R


open class BaseActivity : AppCompatActivity() {

    @SuppressLint("PrivateResource")
    fun <G> navigateTo(className: Class<G>, bundle: Bundle?, needDefaultAnim: Boolean) {
        val intent = Intent(this, className)
        if (bundle != null)
            intent.putExtras(bundle)
        startActivity(intent)
        if (needDefaultAnim)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        else
            overridePendingTransition(R.anim.abc_popup_enter, R.anim.abc_popup_exit)
    }
}