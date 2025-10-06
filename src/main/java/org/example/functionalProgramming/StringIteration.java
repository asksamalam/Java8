package org.example.functionalProgramming;

import java.util.Arrays;
import java.util.Collections;

public class StringIteration {
    public static void main(String[] args) {
        Integer[] arr = {3, 3, 7, 0, 5, 0, 1};
        Arrays.sort(arr, Collections.reverseOrder());
        Integer result = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] != arr[i+1]) {
                result = arr[i+1];
                break;
            }

        }
        System.out.println(result);
    }

}

