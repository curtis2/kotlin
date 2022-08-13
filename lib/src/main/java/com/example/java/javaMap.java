package com.example.java;

import java.util.HashMap;
import java.util.Objects;

public class javaMap {

    public static void main(String[] args) {

        HashMap<MapObject,String> map=new HashMap<>();

        MapObject object1=new MapObject("z");
        MapObject object2=new MapObject("y");
        object1.setNode("3");
        map.put(object1,"1");
        map.put(object2,"2");

//       map.put(object1,"");

        System.out.println(map.size());
        System.out.println(map.get(object1));

    }
}


class MapObject{
    public MapObject(String name) {
        this.name = name;
    }

    public  String node;
    public  String name;

    public void setNode(String node) {
        this.node = node;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapObject object = (MapObject) o;
        return name.equals(object.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}