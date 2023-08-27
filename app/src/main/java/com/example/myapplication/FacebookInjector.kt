package com.example.myapplication

class FacebookInjector: Injector {
    override fun getConsumer(): Consumer {
        return MessageConsumer(FacebookMessageService())
    }
}