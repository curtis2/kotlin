package com.example.lib


fun main(args:Array<String>){
   /* val name= getName()
    if(name==null){
        println("name is invalid")
    }else{
        println(name.length)
    }*/

/*    val name:String= getName()?:return
    println(getName()?.length)*/
//    println(getName().length)

    var strNonNUll:String?="String"
    println(strNonNUll!!.length)
}

fun getName():String?{
    return null
}