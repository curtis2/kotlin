package com.main.closure


/**
 * Created by simon on 6/26/23 23:04
 * 闭包
 * 1.函数运行的环境
 * 2.持有函数运行状态
 * 3.函数内部可以定义函数
 * 4.函数内部也可以定义类
 */

fun makeFun():()->Unit{
    var count=0
    return fun(){
        println(++count)
    }
}

/*fun fibonacci():()-> Long{
    var first=0L
    var second=1L
    return fun():Long{
        val result=second
        second+=first
        first=second -first
        return result
    }
}*/

fun fibonacci():Iterable<Long>{
    var first=0L
    var second=1L
    return Iterable {
        object :LongIterator()  {
            override fun hasNext(): Boolean =true
            override fun nextLong():Long{
                val result=second
                second+=first
                first=second -first
                return result
            }
        }
    }

}


fun main(args:Array<String>){
   /* val x= makeFun()
    println(x)
    x()
    x()
    x()
    x()
    x()*/

   /* val x=fibonacci()

    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())
    println(x())*/

    for (i in fibonacci()){
        if(i>100)break
        println(i)
    }

}

fun add2(x:Int)=fun(y:Int)=x+y

fun add(x:Int):(Int)-> Int{
    return fun(y:Int):Int{
        return x+y
    }
}