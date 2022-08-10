package com.example.chapter4;

import kotlin.properties.Delegates;

public class StaticJava {

    public static void main(String[] args) {

        Latitude latitude=Latitude.ofDouble(3.0);

        System.out.println(Latitude.TAG);

        //kotlin object
        MusicPlayer.INSTANCE.play("");


        Overload overload=new Overload();
        overload.a();
    }
}
