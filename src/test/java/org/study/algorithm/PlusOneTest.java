package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    private PlusOne plusOne;
    @BeforeEach
    void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    void plusOne() {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] digits4 = {9, 9, 9, 9};
        int[] digits5 = {8, 9, 9, 9};

        int[] expected1 = {1, 2, 4};
        int[] expected2 = {4, 3, 2, 2};
        int[] expected3 = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7};
        int[] expected4 = {1, 0, 0, 0, 0};
        int[] expected5 = {9, 0, 0, 0};

        int[] result1 = plusOne.plusOne(digits1);
        int[] result2 = plusOne.plusOne(digits2);
        int[] result3 = plusOne.plusOne(digits3);
        int[] result4 = plusOne.plusOne(digits4);
        int[] result5 = plusOne.plusOne(digits5);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
        assertArrayEquals(expected4, result4);
        assertArrayEquals(expected5, result5);
    }
}