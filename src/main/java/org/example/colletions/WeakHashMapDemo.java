package org.example.colletions;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Integer,String> names = new WeakHashMap<>();
        names.put(1,"Sameer");
        names.put(2,"Aadil");
        names.put(3,"Rahul");
        System.out.println(names);
    }
}
