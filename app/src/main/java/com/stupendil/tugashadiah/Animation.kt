package com.stupendil.tugashadiah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.bumptech.glide.Glide

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        Handler(Looper.getMainLooper()).postDelayed({
            moveTo()
        },3200L)

        showGIF()
    }

    private fun moveTo(){
        Intent(this, BottomNavBarActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }


    private fun showGIF(){
        val imageView:ImageView = findViewById(R.id.imageView1)
        Glide.with(this).load(R.drawable.animasi).into(imageView)
    }
}