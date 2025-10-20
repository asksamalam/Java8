package org.example.string;

public class DemoInterviewQuestion {
    public static void main(String[] args) {
        String str = "12341221345677778912221";
        System.out.println("Longest palindrome: " + longestPalindromicSubstring(str));
    }

    static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() < 2) return s;
        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);       // odd length palindrome
            int len2 = expandFromCenter(s, i, i + 1);   // even length palindrome
            int len = Math.max(len1, len2);

            if (len > maxLen) {
                start = i - (len - 1) / 2;
                maxLen = len;
            }
        }
        return s.substring(start, start + maxLen);
    }

    static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
