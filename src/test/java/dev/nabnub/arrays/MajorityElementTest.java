package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    void majorityElement_shouldReturn5() {
        assertEquals(5, majorityElement.majorityElement(new int[]{5,5,1,1,1,5,5}));
    }


    @Test
    void majorityElement_shouldReturn2() {
        assertEquals(2, majorityElement.majorityElement(new int[]{2,2,2}));
    }


}