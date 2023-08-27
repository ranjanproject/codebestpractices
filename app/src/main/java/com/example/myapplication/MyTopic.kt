package com.example.myapplication

import kotlinx.coroutines.sync.Mutex


class MyTopic: Subject {

    private val observerList = mutableListOf<Observer>()

    private var message: String = ""
    private var changed = false
    private val mutex = Mutex()

    override fun register(observer: Observer) {
        synchronized(mutex){
            if(!observerList.contains(observer)) observerList.add(observer)
        }

    }

    override fun unregister(observer: Observer) {
       synchronized(mutex) {
            observerList.remove(observer)
        }

    }

    override fun notifyObservers() {
        var observersLocal: MutableList<Observer>
        //synchronization is used to make sure any observer registered after message is received is not notified
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized(mutex) {
            if (!changed) return
            observersLocal = observerList.toMutableList()
            changed = false
        }
        for (obj in observersLocal) {
            obj.update()
        }
    }

    override fun getUpdate(observer: Observer): String{
        return this.message
    }

    //method to post message to the topic
    fun postMessage(msg: String) {
        println("Message Posted to Topic:$msg")
        message = msg
        changed = true
        notifyObservers()
    }
}