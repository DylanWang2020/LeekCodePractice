package com.dylan.question;

import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(lengthOfLongestSubstring("abcdabcde"));
    }

    static public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int left = 0;
        int max = 0;
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i -left + 1);
        }
        return max;
    }
}