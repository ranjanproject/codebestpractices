package com.example.myapplication

class SmallCar: Car {
    private var speed = 0
    private var accl = 1

    override fun getCarType(){
        println(CarType.SMALL.toString())
    }
    override fun accelerat(){
        accl +=1
        println("Small Car Acclerated: $accl")
    }
    override fun speed(){
        speed += accl
        println("Small Car SpeedUp: $speed")
    }
}