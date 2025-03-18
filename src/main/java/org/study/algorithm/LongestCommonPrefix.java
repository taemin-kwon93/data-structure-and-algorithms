package org.study.algorithm;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Map<String, Integer> map = new HashMap<>();

        // Build prefix frequency map
        for (String s : strs) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(c);
                map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            }
        }

        // Sort the map entries based on the custom comparator
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());

        sortedEntries.sort((a, b) -> {
            // Compare by value in descending order
            if (!a.getValue().equals(b.getValue())) {
                return Integer.compare(b.getValue(), a.getValue());
            }
            // If values are the same, compare by key length in descending order
            return Integer.compare(b.getKey().length(), a.getKey().length());
        });

        // The longest common prefix will be the first valid entry in the sorted list
        if (!sortedEntries.isEmpty() && sortedEntries.get(0).getValue() == strs.length) {
            return sortedEntries.get(0).getKey();
        }
        return "";
    }

    public String longestCommonPrefix2(String[] strs) {
        String prefix = strs[0];

        for(String str : strs) {
            while(!prefix.isEmpty() && !str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
