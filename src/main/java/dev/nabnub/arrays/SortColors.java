package dev.nabnub.arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int maxNum = 2;
        int count = 0;

        int[] countArray = new int[maxNum + 1];

        populateArray(countArray, nums);

        for (int i = 0; i < countArray.length; i++) {
            for (int j = countArray[i]; j > 0; j--) {
                nums[count++] = i;
            }
        }
    }

    private void populateArray(int[] countArray, int[] nums) {
        for (int num : nums) {
            countArray[num]++;
        }
    }

}
