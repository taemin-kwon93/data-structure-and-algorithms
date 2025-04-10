package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {
    private RemoveDuplicateLetters removeDuplicateLetters;

    @BeforeEach
    void setUp() {
        removeDuplicateLetters = new RemoveDuplicateLetters();
    }

    @Test
    void solution() {
        String s = "dbacdcbc";
        String expected = "acdb";

        String result = removeDuplicateLetters.solution(s);

        assertEquals(expected, result);
    }

    @Test
    void solution2() {
        String s1 = "dbacdcbc";
        String s2 = "abacb"; // for 문 내 if sentence 디버깅 용
        String s3 = "bacbc"; // for 문 내 if sentence 디버깅 용

        String expected1 = "acdb";
        String expected2 = "abc";
        String expected3 = "abc";

        String result1 = removeDuplicateLetters.removeDuplicateLetters2(s1);
        String result2 = removeDuplicateLetters.removeDuplicateLetters2(s2);
        String result3 = removeDuplicateLetters.removeDuplicateLetters2(s3);

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}