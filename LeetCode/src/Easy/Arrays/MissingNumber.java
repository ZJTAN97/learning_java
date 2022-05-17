package Easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    static int findMissingNumber(int[] nums) {

        HashSet<Integer> cache = new HashSet<Integer>();

        int[] arr = new int[nums.length + 1];
        Arrays.setAll(arr, i -> i);

        for (int i : nums) {
            cache.add(i);
        }

        for (int i : arr) {
            if (cache.add(i)) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 0, 1 };

        int answer = findMissingNumber(nums);

        System.out.println(answer);

    }

}
