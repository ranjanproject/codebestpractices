package com.example.myapplication

class MediumCar: Car {

    private var speed = 0
    private var accl = 1

    override fun getCarType(){
        println(CarType.MEDIUM.toString())
    }
    override fun accelerat(){
        accl +=2
        println("Medium Car Acclerated: $accl")
    }
    override fun speed(){
        speed += accl
        println("Medium Car SpeedUp: $speed")
    }
}