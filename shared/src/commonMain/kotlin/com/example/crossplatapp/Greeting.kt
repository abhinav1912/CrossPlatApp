package com.example.crossplatapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}