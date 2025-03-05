package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsClusteringTest {
    private NewsClustering newsClustering;

    @BeforeEach
    void setUp() {
        newsClustering = new NewsClustering();
    }

    @Test
    void solution() {
        int result1 = newsClustering.solution("FRANCE", "french");
        int result2 = newsClustering.solution("handshake", "shake hands");
        int result3 = newsClustering.solution("aa1+aa2", "AAAA12");
        int result4 = newsClustering.solution("E=M*C^2", "e=m*c^2");

        assertEquals(16384, result1);
        assertEquals(65536, result2);
        assertEquals(43690, result3);
        assertEquals(65536, result4);
    }
}