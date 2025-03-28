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
        String result = addBinary.addBinary("11", "1");
        assertEquals("100", result);
    }
}