package Easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] ansArr = new int[2];

        HashMap<Integer, Integer> cache = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(cache.containsKey(diff)) {
                ansArr[0] = cache.get(diff);
                ansArr[1] = i;
            } 
            cache.put(nums[i], i);
        }
        System.out.println(Arrays.toString(ansArr));
        return ansArr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums, target);

    }
}
