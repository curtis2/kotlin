package com.example.chapter3

fun main(args:Array<String>) {

   for(i in args){
       println(i)
   }

    args.forEach {
        println(it)
    }

}
/*
fun sum(arg1: Int,arg2:Int):Int{
    return arg1+arg2
}*/

//lambda表达式

val sum={arg1:Int,arg2:Int -> arg1+arg2}

