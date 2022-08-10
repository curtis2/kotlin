package com.example.lib;

public class BaseType {

    public BaseType(int b) {
        this.b = b;
    }

    public int b=0;
    public final String LL="ss";

    public int getB() {
        return b;
    }

    public static void main(String[] args) {

        BaseType b=new BaseType(1);
        b.getB();
    }


}
