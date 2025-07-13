package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    void topKFrequent_shouldReturn_2_3() {
        assertArrayEquals(new int[] {2,3}, topKFrequentElements.topKFrequent(new int[]{1,2,2,3,3,3}, 2));
    }

    @Test
    void topKFrequent_shouldReturn_7() {
        assertArrayEquals(new int[] {7}, topKFrequentElements.topKFrequent(new int[]{7,7}, 1));
    }
}