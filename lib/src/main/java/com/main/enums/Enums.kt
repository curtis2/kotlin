package com.main

/**
 * Created by simon on 6/25/23 20:53
 *
 */

enum class LogLevel(val id:Int){
    VERBOSE(0),DEBUG(1),INFO(2),WARN(3),ERROR(4),ASSERT(5);

    fun getTag():String{
        return "$id + $name"
    }

    override fun toString(): String {
        return "$name,$ordinal"
    }
}

class LogLevel2 private constructor(){
    companion object{
       val  VERBOSE = LogLevel2()
       val  DEBUG=LogLevel2()
       val  INFO=LogLevel2()
       val  WARN=LogLevel2()
       val  ERROR=LogLevel2()
       val  ASSERT=LogLevel2()
    }

}


fun main(args: Array<String>) {
    println(LogLevel.DEBUG.ordinal)

    LogLevel.values().forEach(::println)

    println(LogLevel.valueOf("ERROR"))
}