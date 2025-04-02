package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private ReverseInteger reverseInteger;

    @BeforeEach
    void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    void reverse() {
        int result1 = reverseInteger.reverse(123);
        int result2 = reverseInteger.reverse(-123);
        int result3 = reverseInteger.reverse(120);
        int result4 = reverseInteger.reverse(2147483647);
        int result5 = reverseInteger.reverse(-2147483648);
        int result6 = reverseInteger.reverse(0);

        assertEquals(321, result1);
        assertEquals(-321, result2);
        assertEquals(21, result3);
        assertEquals(0, result4); // Overflow
        assertEquals(0, result5); // Overflow
        assertEquals(0, result6);
    }

    @Test
    void reverse2() {
        int result1 = reverseInteger.reverse2(123);
        int result2 = reverseInteger.reverse2(-123);
        int result3 = reverseInteger.reverse2(120);
        int result4 = reverseInteger.reverse2(2147483647);
        int result5 = reverseInteger.reverse2(-2147483648);
        int result6 = reverseInteger.reverse2(0);

        assertEquals(321, result1);
        assertEquals(-321, result2);
        assertEquals(21, result3);
        assertEquals(0, result4); // Overflow
        assertEquals(0, result5); // Overflow
        assertEquals(0, result6);
    }
}