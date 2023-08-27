package com.example.myapplication

import org.junit.Before
import org.junit.Test

class MessageTester {

    private lateinit var injector: Injector

    /**
     * creating mock injector
     * Whatsapp type messenger
     */
    @Before
    fun setUp(){
        injector = object : Injector{
            override fun getConsumer(): Consumer {
                return object: Consumer{
                    override fun postMessage(name: String, message: String): String {
                         return MessageConsumer(object : MessageService{
                            override fun sendMessage(name: String, message: String): String {
                                return "WApp"
                            }
                        }).postMessage(name, message)
                    }

                }
            }

        }
    }


    @Test
    fun test_facebook_message(){
        val injector1 = FacebookInjector()
        val x = injector1.getConsumer().postMessage("pratik", "kjabkjbg")
        assert(x == FacebookMessageService.TAG)
    }

    @Test
    fun test_new_type_of_injector_message(){
        val c = injector.getConsumer()
        val y = c.postMessage("ranjan", "kakbkgabkb")
        assert(y == "WApp")
    }

}