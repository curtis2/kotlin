package com.interview.designPattern.singleton;

public class DclSingleton {

//    private static DclSingleton mInstance=null;
    private static volatile DclSingleton mInstance=null;

    private DclSingleton(){}

    public static DclSingleton getInstance(){
        //避免不必要同步
        if(mInstance==null){
            //同步
             synchronized (DclSingleton.class){
                 //在第一次调用的时候初始化
                 if(mInstance==null){
                     mInstance=new DclSingleton();
                 }
             }
        }
        return mInstance;
    }


}
