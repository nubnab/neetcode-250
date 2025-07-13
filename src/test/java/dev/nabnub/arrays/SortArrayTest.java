package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    private final SortArray sortArray = new SortArray();

    @Test
    void sortArray_shouldReturn_1_1_1_1_3_9_10() {
        assertArrayEquals(new int[] {1,1,1,1,2,3,9,10},
                sortArray.sortArray(new int[] {10,9,1,1,1,2,3,1}));
    }

    @Test
    void sortArray_shouldReturn_1_2_3_5_10() {
        assertArrayEquals(new int[] {1,2,3,5,10},
                sortArray.sortArray(new int[] {5,10,2,1,3}));
    }

}