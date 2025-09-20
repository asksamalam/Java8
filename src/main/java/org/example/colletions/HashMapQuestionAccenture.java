package org.example.colletions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapQuestionAccenture {
    public static void main(String[] args) {
        String str = "HelloAcccccentuuuure";
        List<Character> characterList = str.chars().mapToObj(c -> (char)c).toList();
        Map<Character,Integer> charFreq = new HashMap<>();
        for(Character c : characterList){
            charFreq.put(c,charFreq.getOrDefault(c,0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(Character c : characterList){
            Integer frequency = charFreq.get(c);
            if(frequency > 1){
                result.append(frequency);
            }else{
                result.append(c.toString());
            }
        }
        System.out.println(result);

    }
}
