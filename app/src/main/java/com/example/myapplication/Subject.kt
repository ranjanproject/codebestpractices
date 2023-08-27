package com.example.myapplication

interface Subject {
    //methods to register and unregister observers
    fun register(observer: Observer)
    fun unregister(observer: Observer)

    //method to notify observers of change
    fun notifyObservers()

    //method to get updates from subject
    fun getUpdate(observer: Observer): String
}