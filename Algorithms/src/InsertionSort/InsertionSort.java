import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {

        int[] sampleArr = {5, 1, 3, 10};

        int[] sortedArr = insertionSortMethod(sampleArr);

        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] insertionSortMethod(int[] arr) {
        
        for(int i=0; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1; // prev index
            while( j>=0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = current;
        }

        return arr;
    }

}
