package com.example.lib;

public class NullUnSafe {


    public static void main(String[] args) {

      getName().length();
    }

    public static String getName(){
        return null;
    }
}
