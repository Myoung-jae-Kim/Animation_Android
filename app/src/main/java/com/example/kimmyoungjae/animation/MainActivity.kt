package com.example.kimmyoungjae.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click = findViewById(R.id.animation) as Button

        btn_click.setOnClickListener {
            Toast.makeText(this@MainActivity,"Clicked",Toast.LENGTH_LONG)
            av_from_code.setAnimation("rewards.json")
            av_from_code.playAnimation()
            av_from_code.loop(true)
        }
        /*av_from_code.setAnimation("rewards.json")
        av_from_code.playAnimation()
        av_from_code.loop(true)*/
    }




}
