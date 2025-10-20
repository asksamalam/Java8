package org.example.questions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println("aabb");
        System.out.println("loveleetcode");
    }

    // Core JAVA
    public static int firstUniqChar(String s) {
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

    //Functional Programming
    public static int firstUniqCharStream(String s) {
        return IntStream.range(0, s.length())
                .filter(i -> s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                .findFirst()
                .orElse(-1);
    }
}
