package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeString767Test {
    private ReorganizeString767 reorganizer767;

    @BeforeEach
    public void setUp() {
        reorganizer767 = new ReorganizeString767();
    }

    @Test
    public void testEmptyString() {
        assertEquals("", reorganizer767.reorganizeString(""), "Empty string should return empty");
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", reorganizer767.reorganizeString("a"), "Single character should return itself");
    }

    @Test
    public void testAlreadyValid() {
        String input = "ab";
        String result = reorganizer767.reorganizeString(input);
        assertTrue(isValidReorganization(input, result),
                "Result should be a valid reorganization for '" + input + "'");
    }

    @Test
    public void testSimpleReorganization() {
        String input = "aab";
        String result = reorganizer767.reorganizeString(input);
        assertTrue(isValidReorganization(input, result),
                "Result should be a valid reorganization for '" + input + "'");
    }

    @Test
    public void testImpossibleReorganization() {
        String input = "aaab";
        String result = reorganizer767.reorganizeString(input);
        assertEquals("", result, "Impossible reorganization should return empty string");
    }

    @Test
    public void testLongerString() {
        String input = "aaabbc";
        String result = reorganizer767.reorganizeString(input);
        assertTrue(isValidReorganization(input, result),
                "Result should be a valid reorganization for '" + input + "'");
    }

    private boolean isValidReorganization(String original, String candidate) {
        if (candidate == null || candidate.length() != original.length()) {
            return false;
        }
        // Check no two adjacent chars are the same
        for (int i = 1; i < candidate.length(); i++) {
            if (candidate.charAt(i) == candidate.charAt(i - 1)) {
                return false;
            }
        }
        // Check character counts match
        int[] counts = new int[128];
        for (char c : original.toCharArray()) counts[c]++;
        for (char c : candidate.toCharArray()) counts[c]--;
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
}