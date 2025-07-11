package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum_shouldReturn01() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 4, 5, 6}, 7));
    }

    @Test
    void twoSum_shouldReturn02() {
        assertArrayEquals(new int[]{0, 2}, twoSum.twoSum(new int[]{4, 5, 6}, 10));
    }

}