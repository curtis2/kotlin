package com.main


/**
 * Created by simon on 6/23/23 11:55
 * 运算符重载
 * 1.任何类可以定义或者重载父类的基本运算符
 * 2.通过运算符对应的具名函数来定义
 * 3.对参数个数做要求，对参数和返回值类型不做要求
 * 4.不能像Scala一样定义运算符  （能重载的只有，+ - in  等等）
 */

class Complex(var real:Double,var imaginary:Double){

    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imaginary+other.imaginary)
    }

    //一个operator关键字，方法名相同，参数个数相同，参数类似和返回值类型可以随意
    //重载 + 运算符
    operator fun plus(other:Int){
        real += other
    }

    //重载 () 运算符
    operator fun invoke():String{
        return "invoke"
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}


class Book{


}

class Desk{

    //中缀表达式
    infix fun on(book:Book):Boolean{
        return false
    }
}

fun main(args: Array<String>) {
    // in是arrays重载 operator contains
   /* if("name" in args){
        println(args[args.indexOf("name")+1])
    }*/

    val c1=Complex(1.0,5.0)
    val c2=Complex(real = 2.0,imaginary = 3.0)

    println(c1 + c2)

    println(c1 + 12)

    println(c1())


   /* if(Desk() on Book()){

    }*/
}
