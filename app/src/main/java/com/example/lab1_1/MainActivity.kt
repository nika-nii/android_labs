package com.example.lab1_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View

const val web_link = "https://www.youtube.com/watch?v=fC7oUOUEEi4"

class MainActivity : LabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openSecond(view: View) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

    fun openWeb(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(web_link))
        startActivity(intent)
    }

    fun openScroll(view: View) {
        val intent = Intent(this, ScrollActivity::class.java)
        startActivity(intent)
    }
}