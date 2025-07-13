package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    private final SortColors sortColors = new SortColors();

    @Test
    void sortColors_shouldReturn0112() {
        int[] nums = new int[]{1,0,1,2};
        sortColors.sortColors(nums);
        assertArrayEquals(new int[] {0,1,1,2}, nums);
    }

    @Test
    void sortColors_shouldReturn012() {
        int[] nums = new int[]{2,1,0};
        sortColors.sortColors(nums);
        assertArrayEquals(new int[] {0,1,2}, nums);
    }
}