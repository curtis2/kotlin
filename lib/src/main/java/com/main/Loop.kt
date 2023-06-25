package com.main

/**
 * Created by simon on 6/23/23 12:59
 *  Kotlin 支持方法扩展，支持lambda表达式，支持函数式编程， 静态语言，与java库百分百兼容，运行在java虚拟机上。
 */

fun main(args: Array<String>) {

/*    for (arg in args){
        println(arg)
    }

    for ((index,value) in args.withIndex()){
        println("$index -> $value")
    }

    for (indexedValue in args.withIndex()){
        println("${indexedValue.index} -> ${indexedValue.value}")
    }*/

    val list=MyList()
    list.add(1)
    list.add(2)
    list.add(3)

    //有iterator方法的类可以在for循环中用 in 这个操作符
   /* for (i in list){
        println(i)
    }*/


    var x=4
  /*  while (x>0){
        x--
        println(x)
    }*/

    do {
        x--
        println(x)
    }while (x>0)
}



class MyIterator(val iterator: Iterator<Int>){
    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }

    operator fun next(): Int {
      return  iterator.next()
    }
}

class MyList{
    private val list= arrayListOf<Int>()

    fun add(int:Int){
        list.add(int)
    }

    fun remove(int:Int){
        list.remove(int)
    }

    operator fun iterator():MyIterator{
        return MyIterator(list.iterator())
    }
}
