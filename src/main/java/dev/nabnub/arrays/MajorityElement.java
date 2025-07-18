package dev.nabnub.arrays;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return 0;
    }

}
