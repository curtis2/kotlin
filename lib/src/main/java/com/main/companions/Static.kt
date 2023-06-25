package com.main.companions


/**
 * Created by simon on 6/25/23 00:12
 *
 * 伴生对象
 * 1.每个类可以对应一个伴生对象
 * 2.伴生对象的成员全局独一份（这里的全局应该指的是java虚拟机）
 * 3.伴生对象的成员类似于Java的静态成员
 * （在kotlin中使用静态成员的时候 考虑使用包级函数或者包级变量代替）
 */

fun main(args: Array<String>) {
//    val a= minOf(args[0].toInt(),args[1].toInt())

    val latitude=Latitude.ofDouble(3.0)
    val latitude2=Latitude.copyLatitude(latitude)
    println(Latitude.TAG)
}


class Latitude private constructor(val value: Double){
    //伴生对象
    companion object{
        @JvmStatic
        fun ofDouble(double: Double):Latitude{
            return Latitude(double)
        }

        fun copyLatitude(latitude: Latitude):Latitude{
            return Latitude(latitude.value)
        }

        @JvmField
        val TAG="Latitude"
    }
}