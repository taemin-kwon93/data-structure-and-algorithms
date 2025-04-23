package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
    private LongestSubstring longestSubstring;

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @ParameterizedTest
    @CsvSource({
            "'abcabcbb', 3",
            "'bbbbb', 1",
            "'pwwkew', 3"
    })
    void solution(String s, int expected) {
        int result = longestSubstring.solution(s);
        assertEquals(expected, result);
    }
}