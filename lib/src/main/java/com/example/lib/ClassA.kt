package com.example.lib

import java.util.logging.XMLFormatter

class X

class A( a:String){
    var b=0

    get() {
        println("some one tries to get b")
        return field
    }
    set(value) {
        println("some one tries to set b")
        field=value
    }

     lateinit var c:String
     val d:X by lazy {
         println("init X")
         X()
     }

    var e:String?=null

}

fun main(args:Array<String>) {

//    val a=A("ha")
//    println(a.b)
    val a=A("")
     println(a.d)

}