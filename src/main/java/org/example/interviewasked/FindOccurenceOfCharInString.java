package org.example.interviewasked;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceOfCharInString {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,6,4,6,7,8,8,3,1,4);
        List<Integer> temp = numbers.stream().sorted().distinct().toList();
        System.out.println("Sort List" + temp);
        String str = null;
        System.out.println(str.toUpperCase());

        String name = "dfierwjfsdjfskjldfsfiouerwkjl";
        System.out.println(streamFindOccurrenceOfCharInString(name));
        Thread virtualThread = Thread.ofVirtual().start(() -> System.out.println(Thread.currentThread().getName()+ " this is thread"));
        printValue(4.5);
        printValue(1);
        int[] arr = {4,3,6,2,6,3,8};
        Integer[] result = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .distinct()
                .toArray(Integer[]::new);
        System.out.println("Array : "+result[2]);

        List<Integer> resultList = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println("ArrayList : "+resultList.get(1));
    }

    public static void printValue(int x){
        System.out.println("Int : "+x);
    }
    public static void printValue(double d){
        System.out.println("Double : "+d);
    }

    //Stream
    public static Map<Character,Long>  streamFindOccurrenceOfCharInString(String name){
        Map<Character,Long> characterList = name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
        ));

        List<Character> characters = name.chars().mapToObj(c -> (char)c).toList();
        System.out.println(characters);
        return characterList;
    }



}
