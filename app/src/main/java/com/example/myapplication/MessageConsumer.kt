package com.example.myapplication

class MessageConsumer(private val service: MessageService): Consumer {
    override fun postMessage(name: String, message: String) {
        service.sendMessage(name, message)
    }
}