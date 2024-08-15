package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    private Permutations permutations;

    @BeforeEach
    void setUp() {
        permutations = new Permutations();
    }

    @Test
    void permute() {
        int[] nums = {1, 2, 4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 4));
        expected.add(Arrays.asList(1, 4, 2));
        expected.add(Arrays.asList(2, 1, 4));
        expected.add(Arrays.asList(2, 4, 1));
        expected.add(Arrays.asList(4, 1, 2));
        expected.add(Arrays.asList(4, 2, 1));

        List<List<Integer>> results = permutations.permute(nums);

        assertEquals(expected, results);
    }
}