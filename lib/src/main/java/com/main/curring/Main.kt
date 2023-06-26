package com.main.curring

import java.io.OutputStream


/**
 * Created by simon on 6/27/23 00:25
 *
 */

fun hello(x:String,y:Int,z:Double):Boolean{
    return false
}


fun curriedHell(x:String) :(y:Int)->(z:Double) ->Boolean{
    return {
        fun(_:Double):Boolean{
         return true
    }}
}

fun log(tag:String,target:OutputStream,message:Any?){
    target.write("[$tag] $message\n".toByteArray())
}

/*fun log(tag:String)
    =fun(target:OutputStream)
    =fun(message:Any?)
    =target.write("[$tag] $message\n".toByteArray())*/

fun main(args: Array<String>) {
    log("kotlin",System.out,"curring...")
//    log("Kotlin")(System.out)("curring again...")
    ::log.curried()("Kotlin")(System.out)("curring again...")

    println(::log.curried())
}

fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried()
   =fun(p1:P1)=fun(p2:P2)=fun(p3:P3) =this(p1,p2,p3)