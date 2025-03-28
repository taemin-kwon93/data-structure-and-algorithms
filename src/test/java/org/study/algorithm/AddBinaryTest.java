package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {
    private AddBinary addBinary;

    @BeforeEach
    void setUp() {
        addBinary = new AddBinary();
    }

    @Test
    void addBinary() {
        String result1 = addBinary.addBinary("11", "1");
        String result2 = addBinary.addBinary(
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111",
                "1");
        assertEquals("100", result1);
        assertEquals("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", result2);
    }

    @Test
    void addBinaryB() {
        String result1 = addBinary.addBinaryB("11", "1");
        String result2 = addBinary.addBinary(
                "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111",
                "1");
        assertEquals("100", result1);
        assertEquals("1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", result2);
    }
}