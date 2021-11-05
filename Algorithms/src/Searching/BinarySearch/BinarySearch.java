public class BinarySearch {

    public int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int middle = left + (right - left) / 2;

            // Check if target is present at middle
            if(arr[middle] == target ) {
                return middle;
            }

            // if target is greater, ignore left half
            if(arr[middle] < target) {
                left = middle + 1;
            } else {
                // if target is smaller, ignore right half
                right = middle - 1;

            }
        }
        // not present in array
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int arr[] = {2, 3, 4, 5, 6, 10, 40};
        int target = 10;
        int result = search.binarySearch(arr, target);
        System.out.println(result);
    }
}
