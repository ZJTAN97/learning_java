public class MaximumSubArray {

    static int MaxSubArray(int[] nums) {

        int currentValue = 0;
        int maxValue = nums[0];

        for(int i=0; i < nums.length; i++) {
            if(currentValue < 0) {
                currentValue = 0;
            }
            currentValue += nums[i];
            maxValue = Math.max(maxValue, currentValue);
        }

        System.out.println(maxValue);
        return maxValue;
    }
    
    public static void main(String[] args) {
        
        int[] sample = {1};
        MaxSubArray(sample);

    }
}
