package Algorithms.Searching.LinearSearch;

public class LinearSearch {

    public static int search(int arr[], int item) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            if(arr[i] == item) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 10, 40};
        int item = 10;
        System.out.println(search(arr, item));
    }
}
