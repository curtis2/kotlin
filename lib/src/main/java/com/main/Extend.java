package com.main;

/**
 * Created by simon on 6/24/23 22:48
 */
public abstract class Extend {
    public String name;

    public Extend(String name) {
        this.name = name;
    }
}


class Extend2 extends Extend{
    //等价于 kotlin class LogicMouse(name:String):USBMouse(name){
    public Extend2(String name) {
        super(name);
    }
}

