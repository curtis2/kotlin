package com.example.inner

open class Outter {
    val a:Int=0

     inner class Inner{
        fun hello(){
            println(this@Outter.a)
        }
    }
}

interface OnClickListener{
    fun onClick()
}

class View{
    var onClickListener:OnClickListener? = null
}


fun main(args: Array<String>) {

    val inner=Outter().Inner()

    val view =View()
    //kotlin 匿名内部类,可以继承一个类，实现一个接口
    view.onClickListener= object :Outter(), OnClickListener {
        override fun onClick() {

        }
    }

}