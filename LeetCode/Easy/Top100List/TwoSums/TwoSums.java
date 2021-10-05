import java.util.Arrays;
import java.util.*;

public class TwoSums {
    public static void main(String[] args) {

        int[] myArr = {1, 2, 3, 5, 10};
        int[] ans = bruteTwoSum(myArr, 15);

        // System.out.println(Arrays.toString(ans));

        int[] ansNew = onePass(myArr, 15);
        System.out.println(Arrays.toString(ansNew));

    }

    // brute force method (O(N^2) time complexity)
    public static int[] bruteTwoSum(int[] nums, int target) {

        int[] ansArr = new int[2];

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                int ans = nums[i] + nums[j];
                if(ans == target) {
                    ansArr[0] = j;
                    ansArr[1] = i;
                    
                }
            }
        }
        return ansArr;
    }

    // one pass method
    public static int[] onePass(int[] nums, int target) {

        int[] ansArr = new int[2];
        
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            if(cache.containsKey(target - nums[i])) {
                ansArr[0] = cache.get((target - nums[i]));
                ansArr[1] = i;
            }
            cache.put(nums[i], i);   
        }
        return ansArr;
    }


}
