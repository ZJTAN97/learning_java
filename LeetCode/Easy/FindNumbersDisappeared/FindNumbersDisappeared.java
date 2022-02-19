import java.util.*;

public class FindNumbersDisappeared {

    static List<Integer> findDisappearedNumbers(int[] nums) {

        int[] sequentialArr = new int[nums.length];
        Arrays.setAll(sequentialArr, i -> i+1);

        HashSet<Integer> hash = new HashSet<Integer>();
        List<Integer> returnList = new ArrayList<Integer>();

        for(int i : nums) {
            hash.add(i);
        }

        for (int i : sequentialArr) {
            if(hash.add(i)) {
                returnList.add(i);
            }
        }

        return returnList;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 1};

        System.out.println(findDisappearedNumbers(nums));

    }
}
