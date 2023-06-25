package com.main.innerclass;

import org.jetbrains.annotations.NotNull;

/**
 * Created by simon on 6/25/23 20:18
 */
public class InnerClassJava {
      //非静态成员，实例的属性
     int a;
     class Inner{
         public void hello(){
             //InnerClassJava.this 是一个实例
             System.out.println(InnerClassJava.this.a);
         }

    }

    public static void main(String[] args) {
        InnerClassJava innerClassJava=new InnerClassJava();
        Inner inner=innerClassJava.new Inner();


        View view=new View();
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(@NotNull Object any) {

            }
        });
    }
}
