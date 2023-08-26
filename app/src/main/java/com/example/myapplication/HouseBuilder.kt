package com.example.myapplication

class HouseBuilder: Builder {

   private lateinit var house: House

    override fun reset(): Builder {
        house = House()
        return this
    }
    override fun setDoor(doors: Int): Builder {
        house.door = doors
        return this
    }

    override fun setWindow(windows: Int): Builder {
        house.window = windows
        return this
    }

    override fun setWall(walls: Int): Builder {
        house.walls = walls
        return this
    }

    override fun setFloor(floors: Int): Builder {
        house.floor = floors
        return this
    }

    override fun setRoof(roofs: Int): Builder {
        house.roof = roofs
        return this
    }

    fun build(): House {
       return house
    }
}