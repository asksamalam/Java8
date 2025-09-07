package org.example.colletions;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_practice {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        Map<Person,String> person = new HashMap<>();
        person.put(p1,"Kunal");
        person.put(p2,"Ali");
        System.out.println(person.put(p1,"kunal"));

        for(Map.Entry<Person,String> x : person.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
class Person{
    String name;
    String salary;
    String department;
}
