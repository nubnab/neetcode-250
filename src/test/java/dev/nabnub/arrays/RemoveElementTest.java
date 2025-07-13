package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement_shouldContain_2_3_4() {
        assertEquals(3, removeElement.removeElement(new int[]{1, 1, 2, 3, 4}, 1));
    }

    @Test
    void removeElement_shouldContain_0_1_3_0_4() {
        assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

}