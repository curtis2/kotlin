package com.example.chapter4


fun main(args: Array<String>) {

    val a= minOf(args[0].toInt(),args[1].toInt())

    val latitude=Latitude.ofDouble(3.0)

    val latitude2=Latitude.ofLatitude(latitude)
    println(Latitude.TAG)
}

class Latitude private constructor(val value: Double){
    companion object{
//        val instance:Latitude by lazy { ofDouble()  }
        //静态方法
        @JvmStatic
        fun ofDouble(double: Double):Latitude{
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude):Latitude{
            return Latitude(latitude.value)
        }

        @JvmField
        val TAG:String="Latitude"

    }
}