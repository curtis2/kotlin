package com.example

fun main(args: Array<String>) {
    args.forEach(::print)
    val hello=Hello::world
}

class Hello{
    fun world(){
        println("123")
    }
}