package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePrimeNumberTest {
    private CreatePrimeNumber createPrimeNumber;

    @BeforeEach
    void setUp() {
        createPrimeNumber = new CreatePrimeNumber();
    }

    @Test
    void solution() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};

        int result1 = createPrimeNumber.solution(nums1);
        int result2 = createPrimeNumber.solution(nums2);

        assertEquals(1, result1);
        assertEquals(4, result2);
    }
}