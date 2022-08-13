package com.datastructure;

public class ArrayStack<T> {

     //声明数组
    private T[] arr;

    //栈元素初始数量
    private int num=0;

    public ArrayStack(int size) {
        this.arr= (T[]) new Object[size];
    }

    //入栈
    public void push(T t){
        addSize();
        arr[num++]=t;
    }

    //出栈
    public T pop(){
        if(isEmpty()) return null;
        T popItem=arr[--num];
        arr[num]=null;
        //缩容
        subSize();
        return popItem;
    }

    //返回当前栈中元素数量
    public int size(){
        return this.num;
    }

    //判断栈中元素是否为空
    private boolean isEmpty() {
        return num==0;
    }

    //扩容
    private void addSize() {
        //如果当前栈中元素数量大于或等于数组大小时，就进行2倍扩容
        if(num>= arr.length){
            resize(arr.length*2);
        }
    }


    //缩容
    private void subSize() {
        //如果当前栈中元素数量大于零并小于数组大小的一半时，进行缩容处理
        if(num>0&&num<arr.length/2){
            resize(arr.length/2);
        }
    }

    private void resize(int size) {
         T[] newArr= (T[]) new Object[size];
        for (int i = 0; i < num; i++) {
            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    public static void main(String[] args) {
       ArrayStack<String> arrayStack=new ArrayStack<String>(3);
       arrayStack.push("a");
       arrayStack.push("b");
       arrayStack.push("c");
       arrayStack.push("d");

        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

    }


}
