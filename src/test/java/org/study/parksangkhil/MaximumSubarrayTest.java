package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void solution() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -6, 4};
        int result = maximumSubarray.maxSubArray(nums);
        assertEquals(6, result);
    }
}