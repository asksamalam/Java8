package org.example.corejava;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 5,6,7};
        int len = numbers.length + 1;
        int expSum = len * (len + 1) / 2;
        int sum = Arrays.stream(numbers).sum();
        System.out.println(expSum - sum);
    }
}
