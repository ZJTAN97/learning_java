package SeanPrashadList.Easy.TwoSum;

import java.util.*;

public class TwoSum {

    static int[] getTwoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] return_arr = new int[2];

        for(int i=0; i < arr.length ; i++) {

            int difference = target - arr[i];

            if(map.containsKey(difference)) {
                return_arr[0] = map.get(difference);
                return_arr[1] = i;
            }
            map.put(arr[i], i);
        }

        return return_arr;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };

        getTwoSum(nums, 9);

        System.out.println(Arrays.toString(getTwoSum(nums, 9)));
        
    }
}
