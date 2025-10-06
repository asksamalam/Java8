package org.example.string;

public class StringQuestionsPractice {
    public static void main(String[] args){
        //Reverse a String
        System.out.println(reverseString("Java"));
        //Is Palindrome
        System.out.println(isPalindrome("Madam"));
        //Count Vowel and Consonant
        countVowelAndConsonant("Hello");
        //Count Number of Words
        System.out.println("Number of word in a sentence is " + countNumberOfWords("Number of word in a sentence is "));

    }
    /** Reverse a String **/
    static String reverseString(String input){
        String result = "";
        for(int i = input.length()-1; i >= 0 ; i--){
            result += String.valueOf(input.charAt(i));
        }
        return result;
    }
    /** IsPalindrome **/
    static boolean isPalindrome(String input){
        String sanatizeInput = input.toLowerCase();
        String reverse = reverseString(sanatizeInput);
        return reverse.equals(sanatizeInput);
    }
    /** Count Number of vowel and Constant **/
    static void countVowelAndConsonant(String word){
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiou";
        String sanetizeInput = word.toLowerCase();
            for(int j =0; j<sanetizeInput.length(); j++){
                String currentLetter = ""+sanetizeInput.charAt(j);
                if(vowels.contains(currentLetter)){
                    vowelCount++;
                }else {
                    consonantCount++;
                }

            }
        System.out.println("Vowel "+vowelCount +" | "+"Consonant "+consonantCount);
    }

    /** Find Number of Word in a Sentence **/
    static int countNumberOfWords(String sentence){
        String santizeString = sentence.trim();
        int space = 0;
        for(char c : santizeString.toCharArray()){
            if(c == ' ') space++;
        }
        return ++space;
    }

}
