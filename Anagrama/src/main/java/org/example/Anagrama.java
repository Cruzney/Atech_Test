package org.example;

import java.util.Arrays;

public class Anagrama {
    // Implementação atual com complexidade O(n log n)
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounts = new int[256];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)]++;
            charCounts[t.charAt(i)]--;
        }

        for (int count : charCounts) {
            if (count != 0) return false;
        }

        return true;
    }

}
