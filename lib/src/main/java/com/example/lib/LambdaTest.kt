package com.example


//fun sum(x:Int,y:Int)=x+y
//
val sum={arg1:Int,arg2:Int->
    println("$arg1+$arg2=${arg1+arg2}")
    arg1+arg2
}
//(Int,Int)->Int
val arrayString:Array<String> = arrayOf("我","是","工程师")
//val strArray:Array<String>=arrayOf("","",::)


fun main(args: Array<String>) {

//    println(sum.invoke(1,2))
    //sum是个变量，后边是调用
//    println(sum(1,2))

   /* arrayString.forEach {
        println(it)
    }*/

    println(sum)
}
