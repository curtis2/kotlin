package com.interview.designPattern.singleton;

public class HungrySingleton {

    private static final HungrySingleton mHungrySingleton=new HungrySingleton();

    private HungrySingleton(){
        System.out.println("singleton is create");
    }

    public static HungrySingleton getHungrySingleton() {
        return mHungrySingleton;
    }

    public static void createString(){
        System.out.println("createString in singleton");
    }

    public static void main(String[] args) {
        HungrySingleton.createString();
    }
}
