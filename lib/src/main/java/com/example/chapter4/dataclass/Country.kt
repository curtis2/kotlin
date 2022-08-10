package com.example.chapter4.dataclass


//数据类
data class Country(val id:Int,val name:String)

fun main(args: Array<String>) {
    val china=Country(0,"中国")
    println(china)
    println(china.component1())
    println(china.component2())

    //这什么呀？
    val(id,name)=china
    println(id)
    println(name)

}