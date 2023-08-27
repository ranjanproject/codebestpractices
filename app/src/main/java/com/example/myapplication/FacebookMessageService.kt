package com.example.myapplication

import android.util.Log

class FacebookMessageService: MessageService {
    companion object{
        const val TAG = "Facebook"
    }
    override fun sendMessage(name: String, message: String): String {
//        Log.d(TAG,"$name $message")
        return TAG
    }
}