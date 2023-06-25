package com.main

import java.lang.StringBuilder


/**
 * Created by simon on 6/25/23 01:03
 *
 */
fun main(args: Array<String>) {


    println("abc".multiply(2))
    println("abc" * 12)
    println(1 * 3 )

    val d=DD()
    d.user= 12
    println(d.user)
}

class DD{
    val length=4
}

// 运算符 扩展方法
operator fun String.times(int:Int):String{
    val builder=StringBuilder()
    for (i in 0 until int){
        builder.append(this)
    }
    return builder.toString()
}

//扩展方法
fun String.multiply(times:Int):String{
    val builder=StringBuilder()
    for (i in 0 until times){
        builder.append(this)
    }
    return builder.toString()
}

//扩展成员
val DD.a:Int
   get() =12

//扩展成员
var DD.user:Int
    get() {
        //不能这么写，那扩展成员有个毛用啊
      return this.length
    }
    set(value) {
//        this.user=value
    }


