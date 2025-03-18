package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void romanToInt() {

        int result1 = romanToInteger.romanToInt("III"); // 3
        int result2 = romanToInteger.romanToInt("LVIII"); // 58
        int result3 = romanToInteger.romanToInt("MCMXCIV"); // 1994

        assertEquals(3, result1);
        assertEquals(58, result2);
        assertEquals(1994, result3);
    }
}