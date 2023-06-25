package com.main.objects


/**
 * Created by simon on 6/25/23 20:41
 *Object
 * 1.只有一个实例的类
 * 2.不能自定义构造方法
 * 3.可以实现接口和继承父类
 * 4.本质上就是单例的最简单实现
 */

class Driver

interface OnExternalDriverListener{
    fun mount(driver: Driver)
    fun onMount(driver: Driver)
}

abstract class Player

object MediaPlayer:Player(),OnExternalDriverListener {

    val statue:Int = 1

    fun play(url:String){

    }
    fun stop(){
    }

    override fun mount(driver: Driver) {
        TODO("Not yet implemented")
    }

    override fun onMount(driver: Driver) {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    //直接使用
    MediaPlayer.play("url")
}