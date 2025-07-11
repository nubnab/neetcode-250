package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    private final GroupAnagram groupAnagram = new GroupAnagram();

    @Test
    void groupAnagrams_shouldReturn3Arrays() {
        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};

        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("act", "cat"));
        expected.add(List.of("pots", "tops", "stop"));
        expected.add(List.of("hat"));

        assertEquals(expected, groupAnagram.groupAnagrams(strs));
    }

    @Test
    void groupAnagrams_shouldReturnX() {
        String[] strs = new String[]{"x"};

        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("x"));

        assertEquals(expected, groupAnagram.groupAnagrams(strs));
    }

    @Test
    void groupAnagrams_shouldReturnEmptyArray() {
        String[] strs = new String[]{""};

        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of(""));

        assertEquals(expected, groupAnagram.groupAnagrams(strs));
    }

}