package com.example.myapplication

class LargeCar: Car {

    private var speed = 0
    private var accl = 1

    override fun getCarType(){
        println(CarType.LARGE.toString())
    }
    override fun accelerat(){
        accl +=3
        println("Large Car Acclerated: $accl")
    }
    override fun speed(){
        speed += accl
        println("Large Car SpeedUp: $speed")
    }
}