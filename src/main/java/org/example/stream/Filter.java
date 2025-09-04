package org.example.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> nameList = Arrays.asList("Sameer","sunil","","","Aman","anil","tarun","zoro","");
        System.out.println(numbers);
        // Filter Even Numbers
        System.out.println("Filter Even Numbers");
        System.out.println(filterEvenNumber(numbers));
        //Filter Odd Numbers
        System.out.println(filterOddNumber(numbers));
        System.out.println(nameList);
        //Filter word greater than x
        System.out.println(filterWordsGreaterThan(nameList,4));
        //Filter Empty String
        System.out.println(filterEmptyString(nameList));

    }
    public static List<Integer> filterEvenNumber(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
    public static List<Integer> filterOddNumber(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }
    public static List<String> filterWordsGreaterThan(List<String> list, Integer limit){
        return list.stream().filter(s -> s.length() > limit).collect(Collectors.toList());
    }
    public static List<String> filterEmptyString(List<String> list){
        return list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }
}
