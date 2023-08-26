package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val houseBuilder = HouseBuilder()

        houseBuilder.reset()
            .setDoor(2)
            .setFloor(1)
            .setRoof(1)
            .setWall(4)
       val house = houseBuilder.build()

       Log.d("House", house.toString())
    }
}