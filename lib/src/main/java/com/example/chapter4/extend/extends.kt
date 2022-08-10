package com.example.chapter4.extend

import java.lang.StringBuilder


fun main(args: Array<String>) {

    //kotlin中使用扩展方法
//    println("abc".multiply(8))

    println("abc"* 8)

    //kotlin中使用扩展属性
    println("a".a)

    "a".b=8

}


//可以变的扩展属性
var String.b:Int
  get()=5
  set(value) {

  }


//扩展属性，给String添加一个属性
val String.a:String
   get()="abc"

//扩展方法, 给String扩展的方法
/*
fun String.multiply(int:Int):String{
    val stringBuilder =StringBuilder()
    for (i in 0 until int){
        stringBuilder.append(this)
    }
   return stringBuilder.toString()

}*/

operator fun String.times(int:Int):String{
    val stringBuilder =StringBuilder()
    for (i in 0 until int){
        stringBuilder.append(this)
    }
    return stringBuilder.toString()

}
