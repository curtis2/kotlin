package com.main.dataclass

import com.main.annotations.PoKo


/**
 * Created by simon on 6/25/23 19:14
 * 问题1  allopn和noarg插件没有生效   2023.6.25 20:04

 */
@PoKo
data class Country(val id:Int,val name:String) {
}


class ComponentX{

    operator fun component1():String{
        return "hello "
    }
    operator fun component2():Int{
        return 1
    }
    operator fun component3():Int{
        return 1
    }
    operator fun component4():Int{
        return 0
    }
}

fun main(args: Array<String>) {
    val country=Country(1,"中国")

    println(country)
    println(country.component1())
    println(country.component2())
    val (id,name) = country
    println(id)
    println(name)

    val componentX=ComponentX()
    //(a,b) 想这么写，类中需要定义 operator fun component  方法
    val (a,b,c,d)=componentX
    println("$a,$b$c$d")

    /*for ((index,value) in args.withIndex()){

    }*/
}