package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void duplicate_shouldReturnTrue() {
        assertTrue(containsDuplicate.hasDuplicate(new int[]{1,2,3,2}));
    }

    @Test
    void noDuplicate_shouldReturnFalse() {
        assertFalse(containsDuplicate.hasDuplicate(new int[]{1,2,3,4}));
    }

}