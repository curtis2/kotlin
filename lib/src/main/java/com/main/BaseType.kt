package com.main

import kotlin.math.pow


/**
 * Created by simon on 6/22/23 15:38
 *
 */
class BaseType {

}

val aBoolean:Boolean =true
val anotherBoolean:Boolean=false

val anotherInt:Int=0XFF
val moreInt:Int=0b00000011
val maxInt:Int=Int.MAX_VALUE
val minInt=Int.MIN_VALUE

val aLong:Long = 8313123324214128999
val anotherLong=124
val maxLong:Long= Long.MAX_VALUE
val minLong:Long= Long.MIN_VALUE


val char:String ="\$"
val anotherChar:String ="\'\'"

val aChar:Char='s'

val aInt=2132
val bLong:Long= aInt.toLong()

val string:String?=null
fun main(args: Array<String>) {

    println(anotherInt)
    println(moreInt)
    println(maxInt)
    println(Math.pow(2.0,31.0) -1)
    println(minInt)
    println(-Math.pow(2.0,31.0)-1)

    println(maxLong)
    println(Math.pow(2.0,63.0)-1)
    println(minLong)

    val a:A?=A()
    println(char)
    println(anotherChar)
    println(a?.getName()?:"aa")

    val range:IntRange=0..100

    println(A::class.java)
    "dfd".toInt()
}

class A{
    fun getName():String?{
        return null
    }
}