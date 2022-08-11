package com.example.chapter5

fun main(arg:Array<String>) {
    val list= listOf(1,2,3,4,5)

//    val newList=ArrayList<Int>()

    /*
    java写法
    list.forEach{
        val newElement=it*2 +3
        newList.add(newElement)
    }*/

    val newList=list.map {
         it*2+3
     }

    newList.forEach(::println)

    //git牛逼

}