import java.util.*;

// This question is not officially solved!!
// come back to it.

// https://leetcode.com/problems/range-sum-query-immutable/

public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++)
        nums[i] += nums[i - 1];

        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if(left == 0) {
            System.out.println(nums[right]);
            return nums[right];
        }
        System.out.println(nums[right] - nums[left - 1]);
        return nums[right] - nums[left - 1];
    }

    public static void main(String[] args) {
        int[] sample = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(sample);
        obj.sumRange(0, 2); // 1
        obj.sumRange(2, 5); // -1
        obj.sumRange(0, 5); // -3
        

    }
}
