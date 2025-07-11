package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapTest {

    private final DesignHashMap designHashMap = new DesignHashMap();

    @Test
    public void testHashMapFunctionality() {
        designHashMap.put(1, 1);
        designHashMap.put(2, 2);
        assertEquals(1, designHashMap.get(1));
        assertEquals(-1, designHashMap.get(3));
        designHashMap.put(2, 1);
        assertEquals(1, designHashMap.get(2));
        designHashMap.remove(2);
        assertEquals(-1, designHashMap.get(2));
    }

}