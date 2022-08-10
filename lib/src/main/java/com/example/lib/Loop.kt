package com.example.lib

fun main(args:Array<String>){
 /*  for (arg in args){
       println(arg)
   }
*/
  for ((index,value) in args.withIndex()){
//    println("$index -> $value")
  }

  for (indexedValue in args.withIndex()){
//      println("${indexedValue.index} -> ${indexedValue.value}")
  }

    /*val list=MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    for (i in list) println(i)*/

/*    var x=5
    while (x>0){
        println(x)
        x--
    }

    do {
        println(x)
        x--
    }while (x>0)*/

    val students=ArrayList<Student>()
    val you=Student()
    for (student in students){
        if(student==you)continue //跳出本次循环，执行下一次循环
        if(student.isNotClosedProperly()){
            break //跳出循环
        }
    }

}

class Student{

    fun isNotClosedProperly():Boolean{
        return true
    }
}


class MyIterator(var iterator:Iterator<Int>){

    operator fun next():Int{
        return iterator.next()
    }

    operator fun hasNext():Boolean{
        return iterator.hasNext()
    }
}

//自定义可迭代的类型
class MyIntList{
    private val list=ArrayList<Int>()

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