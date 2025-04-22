package org.study.algorithm;

import java.util.*;

public class SingleNumberII {
    // Todo: 성능개선 필요
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int key = Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return map.get(key) != 3 ? key : -1;
    }
}
