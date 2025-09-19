package org.example.corejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Basic {
    public static void main(String[] args) {

        String nonRepeating = "Selenium";
        System.out.println(nonRepeating.toCharArray());

        String name = "Sameer";
        String name2 = "kumar";
        // print middle value
        System.out.println(name + "|" + findMiddleChar(name));
        System.out.println(name2
                + "|" + findMiddleChar(name2));
        //Palindrome
        String word = "Madam";
        System.out.println(isPalindrome(word));

        // Find the vowels
        String str = "Shalini";
        String vowel = "aeiou";
        String result = "";
        for(int i=0; i<str.length(); i++){
            String s = ""+str.charAt(i);
            if(vowel.contains(s)){
                result +=s;
            }
        }
        System.out.println(result);

        // Remove All swap duplicate character in a string
        String str1 = "HelloAcccentuure";
        int x = 1;
        HashMap<String,Integer> charMapping = new HashMap<>();
        for(int i=1; i < str.length(); i++){
            charMapping.put(str1.charAt(i)+"",x++);
        }
        System.out.println(charMapping);




        // Swap two String without temp
        String s1 = "Sameer";
        String s2 = "alam";
        s1 += s2;
        s2 = s1.substring(0,6);
        s1 = s1.substring(6);
        System.out.println(s1 +" "+s2);

        // Find missing Number
        int[] number = {2,4,8,10};
        int len =  number.length;
        int sum = Arrays.stream(number).sum();
        int value = len * (len - 1)/2;
        System.out.println(sum + " " + value + " " + (sum - value));
    }

    // Palindrome
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        String sb = "";
        for(int i=str.length()-1; i>=0; i--){
            sb += str.charAt(i)+"";
        }
        System.out.println(sb +" "+str);
        return str.equals(sb);
    }

    public static String findMiddleChar(String str){
        String res = "";
        int len = str.length();
        int mid = len/2;
        if(len % 2 == 0){
            res += str.substring(mid-1,mid+1);
        }else{
            res += str.charAt(mid)+"";
        }
        return res;
    }

}
