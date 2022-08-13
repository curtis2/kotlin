package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class javaList {

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);

        list.remove(6);
        for (int i=0;i<list.size();i++){
            System.out.println("the list size is:"+list.size());
            System.out.println(list.get(i));
        }

    }
}
