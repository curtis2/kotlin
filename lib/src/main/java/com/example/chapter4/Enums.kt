package com.example.chapter4

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS
import sun.util.resources.cldr.gl.LocaleNames_gl

enum class LogLevel(val id:Int){
    VERBOSE(0),DEBUG(1),INFO(2),WARN(3),ERROR(4),ASSERT(5);

    fun getTag():String{
        return "$id, $name"
    }
}

fun main(args:Array<String>) {
    println(LogLevel.DEBUG.ordinal)

    LogLevel.values().map(::println)

    println(LogLevel.valueOf("error".toUpperCase()))

}

class LogLevel2 constructor(){
    companion object{
        val VERBOSE=LogLevel2()
        val DEBUG=LogLevel2()
        val INFO=LogLevel2()
        val WARN=LogLevel2()
        val ERROR=LogLevel2()
        val ASSERT=LogLevel2()
    }
}