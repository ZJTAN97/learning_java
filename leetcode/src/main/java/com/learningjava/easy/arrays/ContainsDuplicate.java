package com.learningjava.easy.arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    static boolean checkDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6 };

        Boolean answer = checkDuplicate(nums);

        System.out.println(answer);

    }

}
