package org.example.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortStringUsingLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sameer","kunal","rahul","aman","amit","max","sam");
        Map<Integer,List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
