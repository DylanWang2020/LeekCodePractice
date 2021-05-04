package com.dylan.question;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] result = twoSum(new int[]{1, 2, 3, 4}, 7);
        System.out.println("" + result[0] + ", " + result[1]);
    }

    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int j;
        for (int i=0; i<len; ++i) {
            j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[]{ (int) map.get(j), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}