package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val topic = MyTopic()

        val obj1 = MyTopicSubscriber("Pratik")
        val obj2 = MyTopicSubscriber("Mithlesh")
        val obj3 = MyTopicSubscriber("Gilli")

        topic.register(obj1)
        topic.register(obj2)
        topic.register(obj3)

        obj1.setSubject(topic)
        obj2.setSubject(topic)
        obj3.setSubject(topic)

        topic.postMessage("Hello")


    }
}