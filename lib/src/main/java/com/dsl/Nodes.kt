package com.dsl


/**
 * Created by simon on 6/27/23 23:33
 *
 */
//Tag.()-> Unit  是Tag的扩展方法，所以相当于匿名函数block在实例中运行。 可以理解为在tag中又加了一个成员函数（动态的）
fun html(block:Tag.()-> Unit):Tag{
//    return Tag("html").apply{block(this)}
//    return Tag("html").apply(block)
      val tag= Tag("html")
      tag.block()
    return tag
}

fun Tag.head(block: Head.() -> Unit){
    this@head + Head().apply(block)
}


fun Tag.body(block: Body.() -> Unit){
    this@body + Body().apply(block)
}

class StringNode(val content:String):Node{
    override fun render()=content
}

class Head:Tag("head")

class Body:Tag("body"){
    var id by MapDelegate(properties)
    var cclass by MapDelegate(properties)
}