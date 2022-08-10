package com.example.chapter4

import java.lang.IllegalArgumentException

interface InputDevice {
    fun input(event:Any)
}

interface USBInputDevice:InputDevice

interface BLEInputDevice:InputDevice


abstract class USBMouse(private val name:String):USBInputDevice,OpticalMouse{
    override fun input(event: Any) {
    }

    override fun toString(): String {
        return "name = $name "
    }
}

class LogitechMouse: USBMouse("罗技") {


}

interface OpticalMouse{}

class Computer{

    private fun addUSBInputDevice(inputDevice: USBInputDevice){
        //插入输入设备
        println("add usb input device: $inputDevice")
    }

    private fun addBLEInputDevice(inputDevice: BLEInputDevice){
        println("add ble input device: $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice){
        when(inputDevice){
          is BLEInputDevice ->{
              addBLEInputDevice(inputDevice)
          }
         is USBInputDevice ->{
             addUSBInputDevice(inputDevice)
         }
         else ->{
             throw IllegalArgumentException("输入设备类型不支持")
         }
        }
    }
}

fun main(args: Array<String>) {
    val computer= Computer()
    val usbMouse=LogitechMouse()
    computer.addInputDevice(usbMouse)

}

