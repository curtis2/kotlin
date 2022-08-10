package com.example.chapter4


class Driver2

interface OnExternalDriverMounterListener{
    fun onMount(driver2: Driver2)
    fun onUnMount(driver2: Driver2)
}

abstract class Player

object MusicPlayer:Player(),OnExternalDriverMounterListener{

   val state:Int=0

    fun play(url:String){

    }

    fun stop(){}
    override fun onMount(driver2: Driver2) {
        TODO("Not yet implemented")
    }

    override fun onUnMount(driver2: Driver2) {
        TODO("Not yet implemented")
    }

}