package org.leete.longestSubstring;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }

        }
        return res;
    }

    private static boolean checkRepetition(String s, int start, int end) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("hellomotomotto"));
    }

}
