package com.example.lib

import java.lang.Exception

fun main(args:Array<String>) {
    val result=try {
     args[0].toInt() / args[1].toInt()
    }catch (e:Exception){
        e.printStackTrace()
       0
    }

    println(result)

}