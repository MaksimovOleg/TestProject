package collections;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] out = new int[nums.length];
        int indexOut = 0;
        out[indexOut] = nums[indexOut];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                out[++indexOut] = nums[i+1];
            }
        }
        System.out.println(indexOut+1);
    }
}
