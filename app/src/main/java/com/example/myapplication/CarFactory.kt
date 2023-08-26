package com.example.myapplication

class CarFactory {
    fun getCar(carType: CarType): Car{
        return when(carType){
           CarType.SMALL -> SmallCar()
           CarType.MEDIUM -> MediumCar()
           CarType.LARGE -> LargeCar()
           else -> SmallCar()
        }
    }
}