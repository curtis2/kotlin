package com.example.lib

class Complex(var real:Double,var imaginary:Double) {

    operator fun plus(other:Complex):Complex{

        return Complex(real+other.real,imaginary+other.imaginary)
    }

    override fun toString(): String {
        return "$real +${imaginary}i"
    }
}



class Book1{
    infix fun on(any: Any): Boolean {
        return false
    }

}

class Desk{

}

fun main(args:Array<String>) {
  val c1=Complex(3.0,4.0)
  val c2=Complex(2.0,7.5)
    println(c1 + c2)

  if(Book1() on Desk()){

  }
}