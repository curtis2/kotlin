package com.main.compose


/**
 * Created by simon on 6/27/23 00:06
 *
 */
val add5={i:Int -> i+5}
val multiplyBy2={i:Int -> i * 2}

fun main(args: Array<String>) {
    println(multiplyBy2(add5(8)))   // (5+8) *2

    val and5AndMultiplyBy2=add5 andThen multiplyBy2
    val and5ComposeMultiplyBy2=add5 compose  multiplyBy2
    println(and5AndMultiplyBy2(8))
    println(and5ComposeMultiplyBy2(8))

}


infix fun <P1,P2,R> Function1<P1,P2>.andThen(function:Function1<P2,R>):Function1<P1,R>{
    return fun(p1:P1):R{
        return function.invoke(this.invoke(p1))
    }
}


infix fun <P1,P2,R> Function1<P2,R>.compose(function:Function1<P1,P2>):Function1<P1,R>{
    return fun(p1:P1):R{
        return this.invoke(function.invoke(p1))
    }
}