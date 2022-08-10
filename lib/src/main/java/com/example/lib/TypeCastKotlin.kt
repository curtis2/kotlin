package com.example.lib

fun main(args:Array<String>){

    val parent:Parent=Parent()

    val child:Child?=parent as? Child

/*
    if(parent is Child){
        println(parent.name)
    }
    val string:String?=""
//    if(string is String)
    if(string!=null)
    println(string.length)*/

}