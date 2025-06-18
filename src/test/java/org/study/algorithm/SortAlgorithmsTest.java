package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmsTest {
    private SortAlgorithms sortAlgorithms;
    @BeforeEach
    void setUp() {
        sortAlgorithms = new SortAlgorithms();
    }

    @Test
    void quickSort() {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        int[] expected = {1, 1, 2, 3, 6, 8, 10};

        sortAlgorithms.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void mergeSort() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = {3, 9, 10, 27, 38, 43, 82};

        sortAlgorithms.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }
}