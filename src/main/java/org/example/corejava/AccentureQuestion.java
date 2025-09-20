package org.example.corejava;

public class AccentureQuestion {
    public static void main(String[] args) {
        String str = "HellloAcccentuuure";
        char[] charArray = str.toCharArray();
        int count = 1;
        String  result = "";
        for(int i = 1; i < str.length(); i++){
            char prev = charArray[i-1];
            char curr = charArray[i];
            if(prev == curr){
                count++;
            }else{
                if(count>1){
                    result += count;
                    count=1;
                }else{
                    result += prev;
                }
            }

        }
        System.out.println(result);
    }
}
