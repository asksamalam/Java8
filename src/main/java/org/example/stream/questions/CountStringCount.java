package org.example.stream.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountStringCount {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("java ruby Spring ","spring java","spring python");
        Long count = nameList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                .filter(word ->word.toLowerCase().contains("spring")).count();
        System.out.println(count);
    }
}
