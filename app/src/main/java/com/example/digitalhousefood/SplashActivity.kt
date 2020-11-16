package com.example.digitalhousefood

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


            val maxSplashTime: Long = 2000
            var progressSplash: Long = 0
            val percentResult = maxSplashTime / 101

            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, maxSplashTime)


        }
    }