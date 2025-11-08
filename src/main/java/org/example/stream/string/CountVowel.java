package org.example.stream.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CountVowel {
    public static void main(String[] args) {

        //Count Number of Vowels
        String str = "this is the man";
        long vowelCount = str.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
        System.out.println("Numbers of vowels in "+ str +" is : "+vowelCount);

        //Remove duplicate from String
        String result = str.chars().mapToObj(c -> String.valueOf((char)c)).distinct().collect(Collectors.joining());
        System.out.println(str +" : "+result);

        //Make Uppercase Letter
        String uppercase = Arrays.stream(str.split("")).map(String::toUpperCase).collect(Collectors.joining());
        System.out.println("Uppercase : "+ uppercase);

        //Sort Word by length
        String sortedWord = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.joining(" "));
        System.out.println(sortedWord);


    }


}
