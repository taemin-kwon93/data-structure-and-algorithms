package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        String result1 = longestCommonPrefix.longestCommonPrefix(strs1);
        String result2 = longestCommonPrefix.longestCommonPrefix(strs2);

        assertEquals("fl", result1);
        assertEquals("", result2);
    }

    @Test
    void longestCommonPrefix2() {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        String result1 =  longestCommonPrefix.longestCommonPrefix2(strs1);
        String result2 =  longestCommonPrefix.longestCommonPrefix2(strs2);

        assertEquals("fl", result1);
        assertEquals("", result2);
    }
}