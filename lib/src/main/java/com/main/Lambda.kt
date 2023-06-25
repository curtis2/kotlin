package com.main


/**
 * Created by simon on 6/22/23 22:38
 *
 */

/**
 * lambda表达式的简化
 * 1.函数参数调用时最后一个Lambda可以移出去
 * 2.函数参数只有一个Lambda,调用时小括号可以省略
 * 3.Lambda只有一个参数可默认为 it
 * 4.入参，返回值与形参一致的函数可以用函数引用的方式作为实参传入
 */

fun main(args: Array<String>) {//main函数类型为 (Array<String>) -> Unit
    val args1= arrayOf<String>("1","34","45","b","c","d","$")
    args1.forEach {  }
    args.filter { it=="1" }
        .map {  }

    "x"?.let {  }
 /*   println(sum(1,2))
    println(sum.invoke(1,4))
    println(intToLong(1))*/
//    recallLa({})
/*
    for (i in args1){
        println(i)
    }*/

    //如果function的最后一个参数是lambda表达式，可以移到小括号的外面
    //lambda表达式的最后一行的值是它的返回值类型
//    args1.forEach({it:String -> println(it)})  //(String) -> Unit

//    args1.forEach (::println)
//      args1.forEach(::ovPrintln)
  /*  G<String>("aa") {it:String ->
        println(it)
    }*/

   /* run loop@{
        args1.forEach forEach@{
//          if(it =="b") return //return了整个main函数
//          if(it =="b") return@forEach //return了 "b"这次循环，还是会执行下面的循环 相当于continue
            if (it == "b") return@loop   // 相当于break
           println(it)
        }
    }
    println("The end")*/

//    G2<String>{  //如果我显示指定，泛型方法的类型，那么这个lambda表达式的返回值类型也是指定的
/*    G2{  //如果没有指定类型，那么lambda表示式的默认返回值，就是他的类型。类似java在调用的时候指定类型。  这个例子中，返回值类型为 Unit
        println("")
     }// lambda 的类型  （）-> Unit*/
/*    recallLa{
        println("recall")
      }*/

//    formatA(1,2,sum)
/*      formatA(3,4){arg1:Int,arg2:Int ->
          arg1-arg2
      }// 申明一个lambda表达式，和定义一个方法一样，需要先指定方法的参数，然后是返回值的类型*/

  /*  println(sum)
    println(::printUsage is ()-> Unit)*/
    hello2{v0,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21,v22-> //这里算是function的调用，所以不需要指定参数的类似@1。
        println("$v0,$v1")
    }
    println(::hello2)
}

val sum = {arg1:Int,arg2:Int ->
    println("$arg1 + $arg2 = ${arg1+arg2}")
    arg1 + arg2
}  //method= (Int,Int) -> Int

/*
val sum2 = {arg1,arg2 ->  //好吧，这里必须指定参数类似。 这里算是方法声明，所以需要指定类型
    println("$arg1 + $arg2 = ${arg1+arg2}")
    arg1 + arg2
}  //method= (Int,Int) -> Int
*/

fun recallLa(method:() -> Unit){
    method()
}

fun formatA(a:Int,b:Int,method:(Int,Int) -> Int){
    method(a,b)
}

//genericity
fun <T> G(t:T,method:(T) -> Unit){
    println("test genericity")
    method(t)
}

fun <R> G2(method: () -> R):R{
  return method()
}

val printlnHello = {
    println("helloWorld")
}

fun ovPrintln(str:String){
    println("myPrintln=$str")
}

//具名函数
fun printUsage(){
    println("")
}
val intToLong= fun(x:Int):Long =x.toLong()

//fun TestA(1,2){}  ={1,2 -> }   这两个申明方法的方式是相同的，都是错误的，申明方法的时候参数不能给值，调用的时候才能给参数的值


fun hello2(action:(Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int) -> Unit){//因为在这里已经声明过了方法的参数类似 @1
    action(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)
}