package org.study.algorithm;

import java.util.*;

public class ReorganizeString767 {
    public String reorganizeString(String s) {
        int n = s.length();
        // 1. Count frequencies
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        // 2. Feasibility check
        int maxCount = 0;
        for (int count : freq) {
            maxCount = Math.max(maxCount, count);
        }
        if (maxCount > (n + 1) / 2) {
            return "";
        }
        // 3. Build max-heap of (char, count)
        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (a, b) -> b[1] - a[1]
        );
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                heap.offer(new int[]{i, freq[i]});
            }
        }
        StringBuilder sb = new StringBuilder();
        // 4. Greedily append two most frequent at a time
        while (heap.size() > 1) {
            int[] first = heap.poll();
            int[] second = heap.poll();
            sb.append((char) (first[0] + 'a'));
            sb.append((char) (second[0] + 'a'));
            if (--first[1] > 0) {
                heap.offer(first);
            }
            if (--second[1] > 0) {
                heap.offer(second);
            }
        }
        // 5. Append any remaining character
        if (!heap.isEmpty()) {
            sb.append((char) (heap.poll()[0] + 'a'));
        }
        return sb.toString();
    }
}
