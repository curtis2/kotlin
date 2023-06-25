package com.main.delegate

import kotlin.reflect.KProperty


/**
 * Created by simon on 6/25/23 01:49
 * 属性代理
 *  定义方法 val/var <propertyName>: <Type> by expression
 *  代理者需要实现相应的 setValue/getValue 方法
 */
class Delegate {
    //kotlin中这样写的都是非静态成员
    val hello by lazy(LazyThreadSafetyMode.NONE){
        "hello"
    }

    val hello2 by X()

    var hello3 by X()
}

class X{
   private var value:String?=null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue: $thisRef -> ${property.name}")
        return value?:"defaultValue"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>,value :String) {
        println("setValue: $thisRef -> ${property.name} = $value")
       this.value=value
    }
}

fun main(args: Array<String>) {
    val delegate=Delegate()
    println(delegate.hello)
    println(delegate)
    println(delegate.hello2)
    println(delegate.hello3)

    delegate.hello3="hello3"
    println(delegate.hello3)
}