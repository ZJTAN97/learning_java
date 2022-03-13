package Arrays;

import java.util.Arrays;

/**
 * Problem statement
 * Your input is an array of integers, you have to reorder its entries
 * so that the even entires appear first.
 */

public class ReorderOddEven {

    public static void evenOdd(int[] arr) {
        int nextEven = 0, nextOdd = arr.length - 1;
        while(nextEven < nextOdd) {
            if(arr[nextEven] % 2 == 0) { 
                // item is even number
                nextEven ++;
            } else {
                // item is odd number
                int temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd--] = temp;
            } 
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] sample = {5, 3, 7, 8, 10};
        evenOdd(sample);
    }
}
