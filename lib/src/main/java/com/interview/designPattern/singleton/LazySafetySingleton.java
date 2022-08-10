package com.interview.designPattern.singleton;

public class LazySafetySingleton {
     private static LazySafetySingleton instance;

     private LazySafetySingleton(){}


     //线程安全的懒汉式单例， 方法中声明synchronized关键字
     /*public static synchronized LazySafetySingleton getInstance(){
         if(instance==null){
             instance=new LazySafetySingleton();
         }

         return instance;
     }*/


     //同步代码快实现
     public static LazySafetySingleton getInstance(){
         synchronized (LazySafetySingleton.class){
             if(instance==null){
                 instance=new LazySafetySingleton();
             }
         }
         return instance;
     }

}
