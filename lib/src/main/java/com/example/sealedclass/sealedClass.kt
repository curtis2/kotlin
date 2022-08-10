package com.example.sealedclass

sealed class PlayerCmd {

    class Play(val url:String,val position:Long=0):PlayerCmd()

    class Seek(val position: Long):PlayerCmd()




}