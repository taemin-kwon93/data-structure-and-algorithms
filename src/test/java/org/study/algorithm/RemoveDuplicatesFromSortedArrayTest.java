package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicatesNum;

    @BeforeEach
    void setUp() {
        removeDuplicatesNum = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void removeDuplicates() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        int result1 = removeDuplicatesNum.removeDuplicates(nums1);
        int result2 = removeDuplicatesNum.removeDuplicates(nums2);

        assertEquals(2, result1);
        assertEquals(5, result2);
    }

    @Test
    void removeDuplicates2() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        int result1 = removeDuplicatesNum.removeDuplicates2(nums1);
        int result2 = removeDuplicatesNum.removeDuplicates2(nums2);

        assertEquals(2, result1);
        assertEquals(5, result2);
    }
}