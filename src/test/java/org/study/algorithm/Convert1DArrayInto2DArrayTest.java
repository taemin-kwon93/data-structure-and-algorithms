package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Convert1DArrayInto2DArrayTest {
    private Convert1DArrayInto2DArray convert1DArrayInto2DArray;

    @BeforeEach
    void setUp() {
        convert1DArrayInto2DArray = new Convert1DArrayInto2DArray();
    }

    @Test
    void construct2DArray() {
        // 테스트 케이스 1
        int[] original1 = {1, 2, 3, 4};
        int[][] expected1 = {
                {1, 2},
                {3, 4}
        };
        int[][] result1 = convert1DArrayInto2DArray.construct2DArray(original1, 2, 2);
        assertArrayEquals(expected1, result1);

        // 테스트 케이스 2
        int[] original2 = {1, 2, 3};
        int[][] expected2 = {
                {1, 2, 3}
        };
        int[][] result2 = convert1DArrayInto2DArray.construct2DArray(original2, 1, 3);
        assertArrayEquals(expected2, result2);

        // 실패 케이스 (변환 불가)
        int[] original4 = {1, 2, 3, 4, 5};
        int[][] result4 = convert1DArrayInto2DArray.construct2DArray(original4, 2, 3);
        assertArrayEquals(new int[0][0], result4); // 변환이 불가능하면 빈 배열 반환한다고 가정
    }
}