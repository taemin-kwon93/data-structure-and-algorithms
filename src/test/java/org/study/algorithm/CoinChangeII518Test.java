package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeII518Test {
    private CoinChangeII518 coinChangeII518;

    @BeforeEach
    void setUp() {
        coinChangeII518 = new CoinChangeII518();
    }

    @Test
    void change() {
        int[] coins1 = new int[] {1, 2, 5};
        int[] coins2 = new int[] {2};

        int result1 = coinChangeII518.change(5, coins1);
        int result2 = coinChangeII518.change(3, coins2);

        assertEquals(4, result1);
        assertEquals(0, result2);
    }
}