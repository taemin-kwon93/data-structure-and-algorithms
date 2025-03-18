package org.study.algorithm;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            set.add(i);

        int[] answer = new int[set.size()];
        int idx = 0;

        for (int i : set)
            answer[idx++] = i;
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++)
            nums[i] = answer[i];

        return set.size();
    }

    public int removeDuplicates2(int[] nums) {
        int i = 0, k = 0;
        int n = nums.length;
        while(i + 1 < n) {
            if(nums[i] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        nums[k] = nums[i];
        k++;
        return k;
    }
}
