package org.example.corejava;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
    public static void main(String[] args) {

        String str = "Thit is Java";
        str = str.toLowerCase();
        str = str.replaceAll(" ","");
        Integer count = 0;
        HashMap<Character,Integer> charMap = new HashMap<>();
        for(char c : str.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
//        System.out.println(charMap);
        for(Character x : charMap.keySet()){
            if(charMap.get(x) > 1){
                System.out.println(x + " " + charMap.get(x));
            }
        }
    }
}
