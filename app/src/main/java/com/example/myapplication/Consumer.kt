package com.example.myapplication

interface Consumer{
    fun postMessage(name: String, message: String): String
}