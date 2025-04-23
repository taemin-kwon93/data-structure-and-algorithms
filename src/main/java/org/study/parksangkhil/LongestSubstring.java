package org.study.parksangkhil;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int solution(String s) {
        Map<Character, Integer> used = new HashMap<>();
        int maxLength = 0;
        int left = 0, right = 0;

        for (char c : s.toCharArray()) {
            if (used.containsKey(c) && left <= used.get(c)) {
                left = used.get(c) + 1;
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            used.put(c, right);
            right++;
        }

        return maxLength;
    }
}
