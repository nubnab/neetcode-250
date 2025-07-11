package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArrayTest {

    private final ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

    @Test
    void shouldConcatenate() {
        int[] nums = new int[] {1,4,1,2};

        assertArrayEquals(new int[] {1,4,1,2,1,4,1,2}, concatenationOfArray.getConcatenation(nums));
    }
}