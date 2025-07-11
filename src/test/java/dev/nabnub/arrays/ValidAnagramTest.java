package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void validAnagram_shouldReturnTrue() {
        assertTrue(validAnagram.isAnagram("racecar", "carrace"));
    }

    @Test
    void invalidAnagram_shouldReturnFalse() {
        assertFalse(validAnagram.isAnagram("jar", "jam"));
    }


}