package com.example.videostreeming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        video1.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            i.putExtra("vedio1","https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4")
            startActivity(i)
        }
        video2.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            i.putExtra("vedio1","https://html5demos.com/assets/dizzy.mp4")
            startActivity(i)
        }
        video3.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
             i.putExtra("vedio1","https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4")
            startActivity(i)
        }

    }
}