package org.example.interviewasked;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String example = "aabbcddee";
        //With Loops
        System.out.println(loopFirstNonRepeatingCharacter(example));
        System.out.println(streamFirstNonRepeatingCharacter(example));
    }

    //With Stream
    public static Character streamFirstNonRepeatingCharacter(String example){
        List<Character> characters = example.chars().mapToObj(c -> (char)(c)).toList();
        return characters.stream().filter(c -> example.indexOf(c) == example.lastIndexOf(c)).findFirst().get();
    }

    // With Loops
    public static String loopFirstNonRepeatingCharacter(String example){
        String currentElement = "";
        for(int i=0; i<example.length(); i++){
            currentElement = example.charAt(i)+"";
            if(example.indexOf(currentElement) == example.lastIndexOf(currentElement)){
                return currentElement;
            }
        }
        return currentElement;
    }
}
