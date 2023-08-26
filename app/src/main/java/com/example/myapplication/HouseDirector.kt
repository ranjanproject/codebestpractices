package com.example.myapplication

class HouseDirector {

    fun getSmallHouse(houseBuilder: HouseBuilder): House{
        houseBuilder.reset()
            .setDoor(1)
            .setFloor(1)
            .setRoof(1)
            .setWall(4)
        return houseBuilder.build()
    }

    fun getLargeHouse(houseBuilder: HouseBuilder): House{
        houseBuilder.reset()
            .setDoor(3)
            .setFloor(2)
            .setRoof(2)
            .setWall(8).setWindow(4)
        return houseBuilder.build()
    }
}