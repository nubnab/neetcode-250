package dev.nabnub.arrays;

import java.util.ArrayList;
import java.util.List;

//TODO: improve with LinkedList
public class DesignHashSet {

    private List<Integer> list;

    public DesignHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }


}
