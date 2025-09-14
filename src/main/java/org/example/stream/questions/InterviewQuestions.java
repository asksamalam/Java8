package org.example.stream.questions;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3,5,6,3,6,7,8,5,3,1,24,5,67,86,5,4,3,3);
        List<String> names = Arrays.asList("Sameer","anil","kUmar","Rajeev","kUNAL","suNIl","Ram","amit","faiz","sam","max","kUmar","Ram");

        //Print Even Number from the list
        System.out.println(filterEvenNumbers(numbers));
        //Print Distinct Odd Numbers
        System.out.println(filterDistinctOddNumbers(numbers));
        //Print Names in Uppercase
        System.out.println(toUpperCase(names));
        //Print Name with only first letter in Uppercase
        System.out.println(capitalizeFirstLetter(names));
        //Print Max From a List
        System.out.println(findMaxValue(numbers));
        //Print Max Odd Number from a list
        System.out.println(findMaxOddValue(numbers));
        //Print Name Group by length
        Map<Integer,List<String>> listMap = groupSameLengthNames(names);
        System.out.println(listMap);
        //Print Name Start with letter L
        System.out.println(findByFirstLetter(names,"A"));
        //Print duplicate Integer
        System.out.println(findDuplicateElements(numbers));
        //Print duplicate String
        System.out.println(findDuplicateElements(names));
    }


    /** Function to filter Even numbers **/
    static List<Integer> filterEvenNumbers(List<Integer> numbers){
        return  numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
    }
    /** Function to filter Distinct Odd Numbers**/
    static List<Integer> filterDistinctOddNumbers(List<Integer> numbers){
        return numbers.stream().filter(n -> n%2 != 0).distinct().collect(Collectors.toList());
    }
    /** Function to Transform List of String in Uppercase **/
    static List<String> toUpperCase(List<String> names){
        return names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
    }
    /** Function to Capitalize First Letter of String **/
    static List<String> capitalizeFirstLetter(List<String> names){
        return names.stream().map(n -> n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase()).collect(Collectors.toList());
    }
    /** Function to find Max value from a list **/
    static List<Integer> findMaxValue(List<Integer> numbers){
        return numbers.stream().max(Integer::compareTo).stream().collect(Collectors.toList());
    }
    /** Function to find Odd Max value from a list **/
    static List<Integer> findMaxOddValue(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 != 0).max(Integer::compareTo).stream().toList();
    }
    /** Function to Group same length names **/
    static Map<Integer,List<String>> groupSameLengthNames(List<String> names){
        Map<Integer,List<String>> namesList = names.stream().collect(Collectors.groupingBy(String::length));
        return namesList;
    }
    /** Function to find name start with a letter **/
    static List<String> findByFirstLetter(List<String> names, String L){
        return names.stream().filter(n -> n.toLowerCase().startsWith(L.toLowerCase())).toList();
    }
    /** Function to find Duplicate Letter or Integer **/
    static <T> List<T> findDuplicateElements(List<T> list){
        HashSet<T> seen = new HashSet<>();
        return list.stream().filter(n -> !seen.add(n)).distinct().toList();
    }
}

