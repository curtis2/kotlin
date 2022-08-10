package com.example




fun main(args:Array<String>){
  val x=5

  when(x){
      is Int -> println("is int")
      in 1..100 -> print("x is in 1..100")
      !in 1..100 -> print("x is not in 1..100")

     /* var mode=when{
          args.isNotEmpty()&&args[0]==1 -> 1
          else -> 0
      }*/
  }


}