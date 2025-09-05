package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
    public void main(String[] args){
        List<User> users = Arrays.asList(
                new User("Sam", Arrays.asList("sam@gmail.com", "sam@yahoo.com")),
                new User("Alex", Arrays.asList("alex@gmail.com", "sam@gmail.com")),
                new User("John", Arrays.asList("john@gmail.com", "john@outlook.com"))
        );
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<String> posts = Arrays.asList(
                "Loving #Java and #Streams",
                "Exploring #SpringBoot #Microservices",
                "Working on #AWS and #Java"
        );

        List<String> words = Arrays.asList("Java","stream");


        // Print all unique emails
        System.out.println(getUniqueEmails(users));
        // Flat a Nested list of Integer
        System.out.println(getFlatList(numbers));
        // Find Hashtag
        System.out.println(getAllHashtags(posts));
        // Find distinct character
        System.out.println(getUniqueCharacters(words));

    }

    static List<String> getUniqueEmails(List<User> users){
        return users.stream().flatMap(u -> u.emails.stream()).distinct().collect(Collectors.toList());
    }
    static List<Integer> getFlatList(List<List<Integer>> numbers){
        return numbers.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
    }
    static List<String> getAllHashtags(List<String> posts){
        return posts.stream().flatMap(n -> Arrays.stream(n.split(" ")).filter(s -> s.startsWith("#"))).collect(Collectors.toList());
    }
    static List<String> getUniqueCharacters(List<String> words){
        return words.stream().flatMap(w -> Arrays.stream(w.split(""))).distinct().collect(Collectors.toList());
    }
}

class User {
    String name;
    List<String> emails;
    User(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }
}




