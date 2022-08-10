package com.interview.designPattern.builder;

public class BuilderClient {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);

        Product product=director.construct();
    }
}
