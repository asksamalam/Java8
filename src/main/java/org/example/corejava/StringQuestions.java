package org.example.corejava;

public class StringQuestions {
    public static void main(String[] args) {
        String str = "Welcome to jungle";
        System.out.println(str);
        String[] wordArr = str.split(" ");
        String result = "";

        for(String s : wordArr){
            String temp = "";
            for(int i = s.length()-1; i>=0; i--){
                temp += s.charAt(i) + " ";
            }
            result += temp + " ";
        }
        System.out.println(result);
    }
}
