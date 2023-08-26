package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val houseBuilder = HouseBuilder()
        val houseDirector = HouseDirector()

        val smallHouse = houseDirector.getSmallHouse(houseBuilder)
        val largeHouse = houseDirector.getLargeHouse(houseBuilder)

       Log.d("House", smallHouse.toString())
       Log.d("House", largeHouse.toString())
    }
}