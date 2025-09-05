package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args){
        List<String> nameList = Arrays.asList("sameer","aman","rahul","kumar");
        List<Integer> numberList = Arrays.asList(1,3,5,6,3,6);
        List<Person> personList = Arrays.asList(
                new Person("Sam", 25),
                new Person("Alex", 30),
                new Person("John", 28)
        );

        System.out.println(nameList);

        //convert String into Uppercase
        System.out.println(convertToUpperCase(nameList));

        //Only first char into uppercase
        System.out.println(capitalizeOnlyFirstLetter(nameList));

        //Square of numbers
        System.out.println(numberList);
        System.out.println(squareOfNumbers(numberList));

        //Length of each word
        System.out.println(lengthOfEachWord(nameList));

        // Person List
        for(Person p : personList){
            System.out.println("Name : "+ p.name + " Age : "+ p.age);
        }
        // Extract only name
        System.out.println(extractNameFromPerson(personList));
        //Extract person whose age greater than x
        List<Person> personList1 = extractPersonWithAgeGreaterThan(personList,25);
        personList1.stream().forEach(p -> System.out.println(p.name));


    }

    public static List<String> convertToUpperCase(List<String> list){
        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public static List<String> capitalizeOnlyFirstLetter(List<String> list){
        return list.stream().map(s -> s.substring(0,1).toUpperCase() + s.substring(1)).collect(Collectors.toList());
    }

    public static List<Integer> squareOfNumbers(List<Integer> numberList){
        return numberList.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static List<Integer> lengthOfEachWord(List<String> nameList){
        return nameList.stream().map(s -> s.length()).collect(Collectors.toList());
    }

    public static List<String> extractNameFromPerson(List<Person> personList){
        return personList.stream().map(p -> p.name).collect(Collectors.toList());
    }

    public static List<Person> extractPersonWithAgeGreaterThan(List<Person> personList, Integer ageLimit){
        return personList.stream().filter(p -> p.age > ageLimit).collect(Collectors.toList());
    }
}

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
