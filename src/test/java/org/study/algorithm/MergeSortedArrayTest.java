package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    private MergeSortedArray mergeSortedArray;
    @BeforeEach
    void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] nums3 = {1};
        int[] nums4 = {};
        int[] nums5 = {0};
        int[] nums6 = {1};

        int[] expected1 = {1, 2, 2, 3, 5, 6};
        int[] expected2 = {1};
        int[] expected3 = {1};

        int[] result1 = mergeSortedArray.merge(nums1, 3, nums2, 3);
        int[] result2 = mergeSortedArray.merge(nums3, 1, nums4, 0);
        int[] result3 = mergeSortedArray.merge(nums5, 0, nums6, 1);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}