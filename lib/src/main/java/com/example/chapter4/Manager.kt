package com.example.chapter4

class Manager:Driver,Writer{
    override fun drive() {
        TODO("Not yet implemented")
    }

    override fun writer() {
        TODO("Not yet implemented")
    }
}

//接口代理
class SeniorManager(private val driver: Driver,private val writer: Writer):Driver by driver,Writer by writer


class CarDriver:Driver{
    override fun drive() {
        println("开车呢")
    }
}

class PPTWriter:Writer{
    override fun writer() {
        println("写ppt呢 ")
    }
}

interface Driver{
    fun drive()
}

interface Writer{
    fun writer()
}

fun main(args: Array<String>) {
    val carDriver=CarDriver()
    val writer=PPTWriter()

    val seniorManager=SeniorManager(carDriver,writer)
    seniorManager.drive()
    seniorManager.writer()


}