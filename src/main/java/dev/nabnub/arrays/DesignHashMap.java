package dev.nabnub.arrays;

import java.util.Arrays;

//TODO: improve with LinkedList
public class DesignHashMap {

    private final int[] map;

    public DesignHashMap() {
        map = new int[1_000_001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }

}
