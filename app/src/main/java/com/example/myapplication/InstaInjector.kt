package com.example.myapplication

class InstaInjector: Injector {
    override fun getConsumer(): Consumer {
        return MessageConsumer(InstaMessageService())
    }
}