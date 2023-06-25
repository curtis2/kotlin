package com.main


/**
 * Created by simon on 6/23/23 12:27
 *
 * 表达式
 * 只有一个参数，且用infix修饰的函数
 * 例：  class Book{ infix fun on(place:String){} }
 *      调用 Book() on "myDesk"
 *
 */
fun main(args: Array<String>) {

    val x=5
    val str="case"
    when(x){
        is Int -> println("x is Int type")
        in 1..100 -> println("")
        !in 1..2 -> println()
        args[0].toInt() -> println()
        2 -> println()
    }


    when(str){
        "" -> println()
//        1 -> println()  incompatible types: Int and String
    }

    //赋值时，表达式必须完备
    val mode=when{
        args[0].isNotEmpty()&&args[0]== "1" -> 1
        else -> 0
    }

    val c=C()
    //when 表达式支持任意类似
    when(c){
        C() -> println()
        else ->{

        }
    }

}


class C
class D
