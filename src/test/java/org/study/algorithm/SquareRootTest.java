package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
    private SquareRoot squareRoot;

    @BeforeEach
    void setUp() {
        squareRoot = new SquareRoot();
    }

    @Test
    void mySqrt() {
        int result1 = squareRoot.mySqrt(4);
        int result2 = squareRoot.mySqrt(8);
        int result3 = squareRoot.mySqrt(13);
        int result4 = squareRoot.mySqrt(16);
        int result5 = squareRoot.mySqrt(1);
        int result6 = squareRoot.mySqrt(0);
        int result7 = squareRoot.mySqrt(2147395600);

        assertEquals(2, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
        assertEquals(4, result4);
        assertEquals(1, result5);
        assertEquals(0, result6);
        assertEquals(46340, result7);
    }
}