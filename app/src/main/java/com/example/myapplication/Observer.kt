package com.example.myapplication

interface Observer {
    //method to update the observer, used by subject
    fun update()

    //attach with subject to observe
    fun setSubject(sub: Subject)
}