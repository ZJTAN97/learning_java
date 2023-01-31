package com.learningjava.easy.bits;

public class SingleNumber {

    private static int singleNumber(int[] nums) {

        int result = 0;

        for (int i : nums) {
            result ^= i;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

}
