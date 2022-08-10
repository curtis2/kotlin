package com.example.chapter4.delegates

class Delegates private constructor() {

    //kotlin单例
  /*  companion object {
       val instance: Delegates by lazy {
        Delegates()
       }
   }*/

    val hello by lazy { "HelloWorld" }


}