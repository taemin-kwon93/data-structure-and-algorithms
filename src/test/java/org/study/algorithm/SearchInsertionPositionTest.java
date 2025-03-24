package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertionPositionTest {
    private SearchInsertionPosition searchInsertionPosition;

    @BeforeEach
    void setUp() {
        searchInsertionPosition = new SearchInsertionPosition();
    }

    @Test
    void searchInsert() {
        int[] nums = {1,3,5,6};

        int result1 = searchInsertionPosition.searchInsert(nums, 5);
        int result2 = searchInsertionPosition.searchInsert(nums, 2);
        int result3 = searchInsertionPosition.searchInsert(nums, 7);
        int result4 = searchInsertionPosition.searchInsert(nums, 0);

        assertEquals(2, result1);
        assertEquals(1, result2);
        assertEquals(4, result3);
        assertEquals(0, result4);
    }

    @Test
    void binarySearch() {
        int[] nums = {1, 3, 5, 6};

        int result1 = searchInsertionPosition.binarySearch(nums, 5);
        int result2 = searchInsertionPosition.binarySearch(nums, 2);
        int result3 = searchInsertionPosition.binarySearch(nums, 7);
        int result4 = searchInsertionPosition.binarySearch(nums, 0);

        assertEquals(2, result1);
        assertEquals(1, result2);
        assertEquals(4, result3);
        assertEquals(0, result4);
    }
}