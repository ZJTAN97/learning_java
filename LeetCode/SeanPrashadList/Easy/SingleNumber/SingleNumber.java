import java.util.*;

public class SingleNumber {

    static int findSingleNumber(int[] nums) {

        int single = 0;

        for(int i : nums) {
            System.out.println(single);
            single ^= i;
            System.out.println(single);
            System.out.println("------");
        }

        // System.out.println(single);

        return single;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 1, 2, 4, 4, 3};
        findSingleNumber(nums);

    }
}
