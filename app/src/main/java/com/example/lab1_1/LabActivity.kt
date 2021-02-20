package com.example.lab1_1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class LabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.w("Lab 1", "Activity ${getName()} called onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lab 1", "Activity ${getName()} called onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lab 1", "Activity ${getName()} called onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lab 1", "Activity ${getName()} called Restart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lab 1", "Activity ${getName()} called onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lab 1", "Activity ${getName()} called onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lab 1", "Activity ${getName()} called onDestroy")
    }

    private fun getName(): String? {
        val myClass = this::class
        return myClass.simpleName
    }
}