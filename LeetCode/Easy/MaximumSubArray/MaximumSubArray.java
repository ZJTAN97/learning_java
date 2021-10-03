public class MaximumSubArray {

    static int maxSubArray(int[] nums) {
        
        int currMax = nums[0]; // initialize to first element in array
        int currSum = 0; // initialize to 0

        for(int i: nums) {

            // if currSum < 0, just reset back to 0;
            if(currSum < 0) {
                currSum = 0;
            }

            // this portion will run regardless
            currSum += i;
            // check with it self cause it may be > 0 but less than previous combination.
            currMax = Math.max(currMax, currSum);
        }

        return currMax;

    }

    public static void main(String[] args) {
        int[] numArr = {5, -4, -1, -7, -8};
        int currMax = maxSubArray(numArr);
        System.out.println(currMax);
    }
}
