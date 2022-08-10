package com.example.lib

import org.w3c.dom.ranges.Range

val range:IntRange=1..1024
val range_exclusive:IntRange=0 until 1024

fun main(args:Array<String>) {

    println(range.contains(500))
    println(50 in range)
    for (i in range_exclusive){
        println("$i,")
    }

}