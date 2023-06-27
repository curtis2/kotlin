package com.main.functions

import java.io.File


/**
 * Created by simon on 6/27/23 20:13
 *
 */
fun main(args: Array<String>) {
    val map=HashMap<Char,Int>()

  /*  File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
        val count=map[it]
        if(count==null) map[it]=1
        else map[it]=count+1
    }

    map.forEach(::println)*/

    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
        .groupBy { it }.map { it.key to it.value.count() }.forEach(::println)
}