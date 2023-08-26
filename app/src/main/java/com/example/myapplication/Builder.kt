package com.example.myapplication

interface Builder {

    fun reset(): Builder

    fun setDoor(doors: Int): Builder

    fun setWindow(windows: Int): Builder

    fun setWall(walls: Int): Builder

    fun setFloor(floors: Int): Builder

    fun setRoof(roofs: Int): Builder

}