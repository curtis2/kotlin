package com.example.chapter4

abstract class Person(open val age:Int){
   abstract fun work()
}

class MaNong(age:Int):Person(age){

    override fun work() {
        println("工程师在工作..")
    }
}

class Doctor(override val age:Int):Person(age){
    override fun work() {
        println("医生在工作..")
    }
}

fun main(array: Array<String>) {
    val person=MaNong(29)
    person.work()

    val person2=Doctor(18)
    person2.work()

}