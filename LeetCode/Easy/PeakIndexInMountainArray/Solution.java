package SeanPrashadList.Easy.PeakIndexInMountainArray;

public class Solution {

    public int PeakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    };


    public static void main(String[] args) {

        int[] arr = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        int[] arr2 = { 0, 1, 0 };
        int[] arr3 = { 3, 4, 5, 1 };
        int[] arr4 = { 40, 48, 61, 75, 100, 99, 98, 39, 30, 10 };

        Solution solution = new Solution();
        System.out.println(solution.PeakIndexInMountainArray(arr)); // 2
        System.out.println(solution.PeakIndexInMountainArray(arr2)); // 1
        System.out.println(solution.PeakIndexInMountainArray(arr3)); // 2
        System.out.println(solution.PeakIndexInMountainArray(arr4)); // 4

    }
}
