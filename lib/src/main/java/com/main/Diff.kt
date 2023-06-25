package com.main


/**
 * Created by simon on 6/24/23 23:04
 *
 */

interface AA{
//    var i=0  Property initializers are not allowed in interfaces
/*    var j:Int
      set(value) {}*/ // Property in an interface cannot have a backing field

    fun hello(){}
}


abstract class  BB{
    var j=0
   abstract fun hello()
}