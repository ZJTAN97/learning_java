import java.util.*;

public class MissingNumber {

    static int missingNumber(int[] nums) {
        
        HashSet<Integer> cache = new HashSet<Integer>();
        
        int[] originalArr = new int[nums.length + 1];
        Arrays.setAll(originalArr, i -> i);

        System.out.println(Arrays.toString(originalArr));

        for(int i : nums) {
            cache.add(i);
        }
        
        for(int i : originalArr) {
            if(cache.add(i)) {
                return i;
            } else {

            }
        }

        return 0;
        
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 3, 4};
        int missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
    }
}
