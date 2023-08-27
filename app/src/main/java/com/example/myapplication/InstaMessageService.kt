package com.example.myapplication

import android.util.Log

class InstaMessageService: MessageService {
    companion object{
        const val TAG = "Insta"
    }
    override fun sendMessage(name: String, message: String): String {
//        Log.d(TAG,"$name $message")
        return TAG
    }
}