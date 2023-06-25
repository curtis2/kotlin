package com.main.innerclass


/**
 * Created by simon on 6/25/23 20:17
 *
 */
class Outter{
    val a:Int=0
    //内部类 kotlin默认内部类是静态内部类
    //加 inner 关键字表示非静态内部类
    inner class Inner{
        fun hello(){
            println(this@Outter.a)
        }
    }
 /*  Inner class Inner{
        fun hello(){
            println(a)
        }
    }*/
}

interface OnClickListener{
    fun onClick(any: Any)
}

class View{
    var onClickListener:OnClickListener? = null
}

fun main(args: Array<String>) {
//    val inner=Outter.Inner()  静态内部类
    val inner=Outter().Inner()

    val view=View()
     //匿名内部类， 有点像，用object 实现了一个接口
    view.onClickListener=object :OnClickListener{
        override fun onClick(any: Any) {
            TODO("Not yet implemented")
        }
    }

}

