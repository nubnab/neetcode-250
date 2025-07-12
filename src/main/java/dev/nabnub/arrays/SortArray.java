package dev.nabnub.arrays;

//TODO: explore other sorting algos
public class SortArray {

    public int[] sortArray(int[] nums) {

        if (nums.length <= 1) return nums;

        int left = nums.length / 2;
        int right = nums.length - left;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        System.arraycopy(nums, 0, leftArray, 0, left);
        System.arraycopy(nums, left, rightArray, 0, right);

        leftArray = sortArray(leftArray);
        rightArray = sortArray(rightArray);

        return merge(leftArray, rightArray);
    }

    public int[] merge(int[] leftArray, int[] rightArray) {

        int[] mergedArr = new int[leftArray.length + rightArray.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                mergedArr[k++] = leftArray[i++];
            }   else {
                mergedArr[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) mergedArr[k++] = leftArray[i++];
        while (j < rightArray.length) mergedArr[k++] = rightArray[j++];

        return mergedArr;
    }
}
