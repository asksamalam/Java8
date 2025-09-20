package org.example.corejava;

import java.util.Arrays;
import java.util.List;

public class CountCharUsingStream {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("Apple","Banana","Stawberry");
        Long x = fruitList.stream().flatMapToInt(String::chars)
                        .filter(n -> n == 'a' | n == 'A')
                                .count();
        System.out.println(x);
    }
}
