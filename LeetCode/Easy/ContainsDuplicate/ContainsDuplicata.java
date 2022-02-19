import java.util.*;

public class ContainsDuplicata {

    static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> cache = new HashSet<Integer>();

        for(int i : nums) {
            if(!cache.add(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5, 1};

        containsDuplicate(nums);


    }
}
