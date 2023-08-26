package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = CarFactory()

        val sm = factory.getCar(CarType.SMALL)
        sm.getCarType()
        sm.speed()
        sm.accelerat()
        sm.speed()
        sm.speed()

        val md = factory.getCar(CarType.MEDIUM)
        md.getCarType()
        md.speed()
        md.accelerat()
        md.speed()
        md.speed()

        val l = factory.getCar(CarType.LARGE)
        l.getCarType()
        l.speed()
        l.accelerat()
        l.speed()
        l.speed()
    }
}