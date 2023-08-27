package com.example.myapplication

import android.util.Log

class FacebookMessageService: MessageService {
    override fun sendMessage(name: String, message: String) {
        Log.d("Facebook","$name $message")
    }
}