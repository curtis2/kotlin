package com.example.lib

import java.lang.Exception
import java.lang.NumberFormatException

fun main(args:Array<String>){
   /* try {
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()

        println("$arg1 + $arg2 = ${sumX(arg1, arg2)}")
    }catch (e:NumberFormatException) {
        println("请传入数字参数")
    }catch (e:Exception){
        println("出现异常，${e.message}")
    }finally {
        //一定会执行
        println("谢谢使用")
    }*/

    //具名参数
//    sumX(arg1 = 1,arg2 = 3)

    val list= arrayListOf(1,2,3,4)
    val array= intArrayOf(1,3,5,7)

    hello(ints=*array)
}

//变长参数 vararg



//默认参数
fun hello(double: Double=3.0,vararg ints:Int,str:String="ss"){
    ints.forEach(::println)
    println(str)
}

 fun sumX(arg1:Int,arg2:Int):Int{
    return arg1+arg2
}