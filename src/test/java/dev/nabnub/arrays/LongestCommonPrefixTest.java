package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix_shouldReturn_ba() {
        assertEquals("ba",
                longestCommonPrefix.longestCommonPrefix(new String[]{"bat","bag","bank","band"}));
    }

    @Test
    void longestCommonPrefix_shouldReturn_da() {
        assertEquals("da",
                longestCommonPrefix.longestCommonPrefix(new String[]{"dance","dag","danger","damage"}));
    }

    @Test
    void longestCommonPrefix_shouldReturnEmptyString() {
        assertEquals("",
                longestCommonPrefix.longestCommonPrefix(new String[]{"neet","feet"}));
    }




}