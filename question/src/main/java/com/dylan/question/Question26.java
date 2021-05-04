package com.dylan.question;

public class Question26 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(removeDuplicates(new int[]{1,1,2,2,2,2,3,4,5,6,7}));
    }

    static public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int result = 0;
        for (int i = 0; i < len; ++i) {
            if (i == 0 || nums[i] != nums[i-1]) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}