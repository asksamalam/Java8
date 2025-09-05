package org.example.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> nameList = Arrays.asList("Sameer","sunil","","","Aman","anil","tarun","zoro","");
        String str = "Hello Sameer";

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
        // Distinct characters in String
        System.out.println(getUniqueCharacter(str.replaceAll(" ", "")));

        List<String> nameList1 = Arrays.asList("Sameer","Alam","Kumal","anil","Arsalan");
        //Find longest string
        System.out.println(nameList1.stream().max(Comparator.comparingInt(String :: length)).orElse(null));

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
    public static List<Character> getUniqueCharacter(String str){
        return  str.chars().mapToObj(c -> (char)c).distinct().collect(Collectors.toList());
    }
}
