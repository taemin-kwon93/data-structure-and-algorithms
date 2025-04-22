package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIITest {
    private SingleNumberII singleNumberII;

    @BeforeEach
    void setUp() {
        singleNumberII = new SingleNumberII();
    }

    @Test
    void singleNumber() {
        int[] nums1 = new int[] {2, 2, 3, 2};
        int[] nums2 = new int[] {0, 1, 0, 1, 0, 1, 99};

        int result1 = singleNumberII.singleNumber(nums1);
        int result2 = singleNumberII.singleNumber(nums2);

        assertEquals(3, result1);
        assertEquals(99, result2);
    }
}