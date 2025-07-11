package dev.nabnub.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashSetTest {

    private final DesignHashSet set = new DesignHashSet();

    @Test
    public void testHashSetFunctionality() {
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));
        set.add(2);
        assertTrue(set.contains(2));
        set.remove(2);
        assertFalse(set.contains(3));
    }


}