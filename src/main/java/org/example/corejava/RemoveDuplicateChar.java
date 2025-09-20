package org.example.corejava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,5);
        Set<Integer> numberSet = new LinkedHashSet<>();
        for(Integer n : numbers){
            numberSet.add(n);
        }
        System.out.println(numberSet);
    }
}
