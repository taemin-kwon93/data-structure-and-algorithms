package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetNumberTest {
    private TargetNumber targetNumber;
    @BeforeEach
    void setUp() {
        targetNumber = new TargetNumber();
    }

    @Test
    void solution() {
        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};

        int result1 = targetNumber.solution(numbers1, 3);
        int result2 = targetNumber.solution(numbers2, 4);

        assertEquals(5, result1);
        assertEquals(2, result2);
    }
}