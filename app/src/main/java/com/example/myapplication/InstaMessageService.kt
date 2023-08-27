package com.example.myapplication

import android.util.Log

class InstaMessageService: MessageService {
    override fun sendMessage(name: String, message: String) {
        Log.d("Insta","$name $message")
    }
}