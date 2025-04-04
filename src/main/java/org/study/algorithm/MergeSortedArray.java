package org.study.algorithm;

import java.util.*;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < m; i++)
            l1.add(nums1[i]);

        for (int i = 0; i < n; i++)
            l1.add(nums2[i]);

        l1.sort(Comparator.naturalOrder());

        for (int i = 0; i < nums1.length; i ++)
            nums1[i] = l1.get(i);

        return nums1;
    }
}
