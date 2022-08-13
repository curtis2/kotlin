package com.example.lib

import com.example.lib.市委书记.北京.市委书记


var aBoolean:Boolean=true
val anotherBoolean=false
val FINAL_HELLO_WORALD:String="helll"

open class Person (/*var personality:String, lookLike:String,*/ var voice:String){
    init {
//        println("new了一个${this.javaClass.simpleName}, ta 性格$personality 长相$lookLike 声音$voice")
    }

    fun sing(){

    }
    override fun toString(): String {
        return "$voice"
    }
}
//class Woman(personality:String, lookLike:String, voice:String):Person(personality,lookLike,voice)

fun sum(arg1:Int,arg2:Int):Int{
    return arg1+arg2
}
fun sum2(arg1: Int,arg2: Int)=arg1+arg2

//匿名函数
val intToLong=fun(x:Int):Long{
   return x.toLong()
}

/**
 * 数组
 */
val arrayOfInt:IntArray= intArrayOf(1,3,5,7)

val arrayOfChar:CharArray= charArrayOf('a','b','c')

val arrayOfString:Array<String> = arrayOf("我","是","工程师")

val arrayOf书记:Array<市委书记> = arrayOf(市委书记("张"),市委书记("吴"),市委书记("郑"))

fun main(args: Array<String>) :Unit{
    println(arrayOfInt.size)
    for (int in arrayOfInt){
        println(int)
    }
    println(arrayOf书记[2])
    arrayOf书记[2]= 市委书记("李")
    println(arrayOf书记[2])

    println(arrayOfChar.joinToString())
    println(arrayOfInt.slice(1..2))

    var anInt:Int=5;
    //kotlin 不可隐式转化
//    var aLong :Long=anInt
     var aLong:Long=anInt.toLong()

    val string:String="helloWorld"
    val fromChars:String= String(charArrayOf('h'))
//    println(string===fromChars)

    val arg1:Int=0
    val arg2:Int=1
    //字符串模板
//    println("$arg1+$arg2=${arg1+arg2}")

    var sayHello:String="hello \"Trump\""
//    println(sayHello)

//    val p=Woman("温柔","甜美","粘人")

//    println("${args[0]}")

//      println(sum(12,3))

//      println(intToLong(3))

 /*   println(arrayOfInt.size)
    for (int in arrayOfInt){
        println(int)
    }
*/
}

