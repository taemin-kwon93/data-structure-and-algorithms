package org.study.algorithm;

import java.util.*;

public class NewsClustering {
    static final int N = 65536;

    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = makeGroup(str1.toLowerCase());
        Map<String, Integer> map2 = makeGroup(str2.toLowerCase());

        int intersection = 0, union = 0;

        // Compute intersection and union
        Set<String> allKeys = new HashSet<>(map1.keySet());
        allKeys.addAll(map2.keySet());

        for (String key : allKeys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }

        // Edge case: Both sets are empty
        double jaccard = (union == 0) ? 1.0 : (double) intersection / union;
        return (int) (jaccard * N);
    }

    public Map<String, Integer> makeGroup(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String pair = s.substring(i, i + 2);
            if (pair.matches("[a-z]{2}")) {
                map.put(pair, map.getOrDefault(pair, 0) + 1);
            }
        }
        return map;
    }
}
