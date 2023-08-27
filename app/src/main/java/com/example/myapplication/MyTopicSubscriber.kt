package com.example.myapplication

class MyTopicSubscriber(private val message: String): Observer {

    private lateinit var topic: Subject

    override fun update() {
        val x = topic.getUpdate(this)
        println("$message $x")
    }

    override fun setSubject(sub: Subject) {
        topic = sub
    }
}