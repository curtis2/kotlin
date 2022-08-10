package com.example.chapter4.extend;

public class ExtendsJava {

    public static void main(String[] args) {
        if(Utils.isEmpty(args)){

        }
        //在java中使用kotlin扩展方法
        System.out.println(ExtendsKt.times("abc",18));

    }
}
