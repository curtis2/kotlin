package com.main


/**
 * Created by simon on 6/24/23 23:24
 *
 */
//接口代理。 对多继承的一种曲线化实现
open class SeniorManager(driver: Driver, writer: Writer):Driver by driver,Writer by writer {
}
open class SeniorManager2(driver: Driver, writer: Writer):Driver by driver,Writer by writer {

}
//如果不加var或者val 那我这个driver算是成员属性吗？
class Manager(val driver: Driver, writer: Writer):SeniorManager(driver,writer){

    fun work(){
//        drive()  不加val 访问不到driver 但是可以直接调用
//        driver.age=10
//        driver.drive()
    }
}

class CarDrive:Driver{
    override var age: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun drive() {
        println("开车中...")
    }

}

class PPTWriter:Writer{
    override fun write() {
        println("写ppt中...")
    }
}

interface Driver{
    var age:Int
    fun drive()
}

interface Writer{
    fun write()
}

fun main(args: Array<String>) {
    val driver=CarDrive()
    val writer=PPTWriter()

    val seniorManager=SeniorManager(driver,writer)
    seniorManager.drive()
    seniorManager.write()


}