package com.example.chapter4

abstract class A{
    var i=0
   abstract  fun hello()
}


interface B{
    var j:Int
    fun hello(){
        println(j)
    }
}
interface C
interface F

open class H

class D:H(){


}