package org.example.interviewasked;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondMostFrequentInAList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sameer","Anil","Kunal","Rajeev","Rajeev","","sameer","nikhil",null);
        //First Check if list is not empty
        if(!names.isEmpty() || names != null){
            List<String> sanitizedNames = names.stream()
                    .filter(s -> s != null && s != "")
                    .map(s -> s.toLowerCase())
                    .toList();
            Set<String> uniqueNames = new HashSet<>(sanitizedNames);
            Map<String,Long> nameWithFreq = new LinkedHashMap<>();
            for(String s : uniqueNames){
                nameWithFreq.put(s, (long) Collections.frequency(sanitizedNames, s));
            }

            for(Map.Entry<String,Long> entry : nameWithFreq.entrySet()){
                if(entry.getValue() > 1)
                System.out.println(entry.getKey()+"| "+entry.getValue());
            }

            //Using Stream API
            nameWithFreq.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .forEach(entry -> System.out.println(entry.getKey() +" "+entry.getValue())
                    );
        }
    }
}
