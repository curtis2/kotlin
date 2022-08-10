package com.example.lib

fun main(args:Array<String>) {
    println("请输入算式例如 3+4 ")
    val str= readLine();
    println(str)
    val strX=str.toString()
    var intA=strX.slice(0 until  1)
    var intB=strX.slice(strX.length-1 until strX.length)

    println("$intA $intB")

    println("计算结果为 ${sumX(intA.toInt(), intB.toInt())}")
}

