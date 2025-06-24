package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {
    private SumOfTwoIntegers sumOfTwoIntegers;

    @BeforeEach
    void setUp() {
        sumOfTwoIntegers = new SumOfTwoIntegers();
    }

    @Test
    void solution() {
        String expected = "305793246910280479981";

        String result = sumOfTwoIntegers.solution("18446744073709551615", "287346502836570928366");

        assertEquals(expected, result);
    }
}