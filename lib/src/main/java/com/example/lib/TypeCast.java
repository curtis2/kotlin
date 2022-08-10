package com.example.lib;

public class TypeCast {
    public static void main(String[] args) {
        Parent parent=new Child();
        Child child= (Child) parent;
        System.out.println(child.getName());

        if(parent instanceof Child){
            ((Child) parent).getName();
        }

    }
}
