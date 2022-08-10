package com.interview.designPattern.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance() {
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

    public static void createString(){
        System.out.println("createString in singleton");
    }

    public static void main(String[] args) {
        LazySingleton.createString();
    }
}
