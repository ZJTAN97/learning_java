import java.util.*;

// Dynamic Programming Problem
// Guide: https://www.youtube.com/watch?v=FoLSpCsQ0rA


public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        /**
         * This constructor does the following
         * Input : -2   0   3  -5   2  -1
         * Output: -2  -2   1  -4  -2  -3
         * Essentially you are finding the sums of the array before the current item
         */

        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.nums = nums;
        System.out.println("Constructor called..");
    }

    public int sumRange(int first, int last) {
        // If first index required is 0, all we have to do is just return the final item of the "constructed" nums
        if(first == 0) {
            return nums[last];
        }
        // 
        return nums[last] - nums[first - 1];
    }

    public static void main(String[] args) {
        int[] sample = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(sample);

        obj.sumRange(0, 2); // 1
        obj.sumRange(2, 5); // -1
        obj.sumRange(0, 5); // -3
        

    }
}
