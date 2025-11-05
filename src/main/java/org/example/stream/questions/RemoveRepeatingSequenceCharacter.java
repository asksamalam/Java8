package org.example.stream.questions;

import java.util.List;

public class RemoveRepeatingSequenceCharacter {
    public static void main(String[] args) {
        String str = "eeadeaa";
        List<Character> result = str.chars().mapToObj(c -> (char)c).distinct().toList();
        System.out.println(result);
    }
}
