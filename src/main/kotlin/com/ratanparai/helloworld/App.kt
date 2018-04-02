package com.ratanparai.helloworld

object App {

    @JvmStatic
    fun main(args: Array<String>){
        println(greeting())
    }

    fun greeting(): String{
        return "Hello World!"
    }
}