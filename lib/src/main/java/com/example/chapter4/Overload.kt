package com.example.chapter4

class Overload{

   //默认参数
    @JvmOverloads
    fun a(int:Int =0):Int{
        return int
    }

}


fun main(args:Array<String>) {

    val overload=Overload()
    overload.a()

}