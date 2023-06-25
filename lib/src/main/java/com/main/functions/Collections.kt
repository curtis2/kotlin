package com.main.functions

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.lang.StringBuilder


/**
 * Created by simon on 6/26/23 00:04
 *  集合相关的函数的使用及原理  forEach, map ,flatMap,fold, reduce, filter。takeWhile,let ,apply,use等
 */
fun main(args: Array<String>) {

   /* val list= listOf(1,2,3,4,5,6)

    val newList=list.map{ it *2 +3 }

    val newList2=list.map(Int::toDouble)

    println(newList)
    println(newList2)*/

    val list= listOf(
        1..10,
        5..20,
        300..305
    )

    val flatList=list.flatten()
  /*   var sum=0
      flatList.forEach {
          sum+=it
      }
    println(sum)*/
//    println(flatList.reduce { acc, i ->  acc+i})

//    (0..6).map(::factorial).forEach(::println)

  /*  println((0..6).map(::factorial).fold(5){acc, i ->
        acc + i
    })*/

    println((0..6).map(::factorial).filter { it % 2 == 1 })


    //遇到第一个不符合的 跳出
    println((0..6).map(::factorial).takeWhile { it % 2 ==1 })
   /* println((0..6).map(::factorial).fold(StringBuilder()){ acc, i ->
        acc.append(i).append(",")
    })

    println((0..6).joinToString())*/
/*    val flatList2=list.flatMap { intRange:IntRange ->
        intRange.map { it:Int ->  //list<String>
            "No.$it"
        }
    }

    println(flatList)
    println(flatList2)*/
//    println(varFun(1,2,3,4))

  findPerson()?.let {
        person ->
      println(person.name)
      println(person.age)
  }

    //block: T.() -> Unit   不懂？ 2023.06.26 01:18
    //block 是用T.() 所以这个block 相当于在扩展方法内，也就是相当于在Person实例的方法内，当然可以访问其他成员了
    //如下例
 /*   fun Person.testA(){
        name
        work()
    }*/

/*    findPerson()?.apply {
      work()
      println(age)
  }*/
/*
    with("abc"){
        length
        isNullOrEmpty()
    }*/
   /* var br:BufferedReader?=null
    try {
         br = BufferedReader(FileReader("hello.txt"))
        with(br) {
            var line: String? = null
            while (true) {
                line = readLine() ?: break
                println(line)
            }
            close()
        }
    }catch (e:FileNotFoundException){
        println("mmp..")
    }finally {
        br?.close()
    }*/

//    var br = BufferedReader(FileReader("hello.txt")).readText()

    BufferedReader(FileReader("hello.txt")).use {
        var line: String? = null
        while (true) {
            line = it.readLine() ?: break
            println(line)
        }
    }
}

data class Person(val name: String, val age:Int){
    fun work(){
        println("$name is working...")
    }
}


fun findPerson():Person?{
    return null
}

//可变参数 + 泛型方法
fun <T> varFun(vararg element:T){

}

fun factorial(n:Int):Int{
    if(n==0) return 1
    // 求阶乘的函数。 如果 n=5  reduce结果就是 1X2X3X4
    return (1..n).reduce {acc, i ->
        acc * i
    }
}