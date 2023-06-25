package com.main

import java.lang.IllegalArgumentException


/**
 * Created by simon on 6/24/23 22:29
 *
 */
interface InputDevice {
    fun input(any: Any)
}

interface USBInputDevice:InputDevice

interface BLEInputDevice:InputDevice{
    val type:String
}

abstract class USBMouse(val name:String):BLEInputDevice,Optical{

    override fun input(any: Any) {
      //接口的真正实现
    }

    override fun toString(): String {
        return name
    }
}

class LogicMouse(name:String):USBMouse(name){
    //实现接口的属性
    override val type: String
        get() = "xx"

}

interface Optical

class Computer{
    private fun addUSBInputDevice(inputDevice: USBInputDevice){
        println("add usb input device $inputDevice")
    }

    private fun addBLEInputDevice(inputDevice: BLEInputDevice){
        println("add ble input device $inputDevice")
        //接口的使用
        inputDevice.input("aa")
    }

    fun addInPutDevice(inputDevice: InputDevice){
        when(inputDevice){
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            is BLEInputDevice-> {
                addBLEInputDevice(inputDevice)
            }
            else -> throw IllegalArgumentException("不支持设备类似")
        }
    }
}

fun main(args: Array<String>) {
    val computer=Computer()
    val mouse=LogicMouse("苹果鼠标")
    println(mouse.type)
    computer.addInPutDevice(mouse)
}

