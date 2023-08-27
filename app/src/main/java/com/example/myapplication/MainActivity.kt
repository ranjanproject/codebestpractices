package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val s1 = Singleton.getInstance()
        val s2 = Singleton.getInstance()
        println("Singleton:$s1")
        println("Singleton:$s2")
    }
}