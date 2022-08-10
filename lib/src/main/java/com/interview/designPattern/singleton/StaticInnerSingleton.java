package com.interview.designPattern.singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstance(){
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static  final StaticInnerSingleton sInstance=new StaticInnerSingleton();
    }

}
