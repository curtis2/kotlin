package com.main.functions


/**
 * Created by simon on 6/25/23 22:47
 * 高阶函数
 * 1.传入或者返回函数的函数
 * 2.函数引用::println
 * 3.带有Receiver 的引用 PdfPrinter::println
 *
 */
fun main(args: Array<String>) {

    //forEach 接收一个函数  类型为（T）- Unit
/*    args.forEach { println(it) }
    //传入一个包级函数的应用
    args.forEach(::println)

    //成员函数引用
    args.filter(String::isNotEmpty)

    val hello_work= Hello::work*/

    args.forEach(Hello()::work)
  /*  Type mismatch.
    Required:
    (String) → Unit
    Found:
    KFunction2<Hello, String, Unit*/
/*    args.forEach (hello_work)*/
//    println((Hello::work)())

    val pdfPrinter=PdfPrinter()
    args.forEach(pdfPrinter::println)

}

class PdfPrinter{
    fun println(any: Any){
       kotlin.io.println(any)
    }
}

class Hello{
    fun work(string: String){
        println(string)
    }
}