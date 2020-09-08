package com.gaadiwaala.ui.intro


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.gaadiwaala.R

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 5000
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        imageView = findViewById(R.id.imageCar) as ImageView
        val an2 = AnimationUtils.loadAnimation(this, R.anim.left_to_right)
        imageView.startAnimation(an2)
        Handler().postDelayed(object:Runnable {

            public override fun run() {

            }
        }, SPLASH_TIME_OUT)
    }
}