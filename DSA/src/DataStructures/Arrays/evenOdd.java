package DataStructures.Arrays;

import java.util.Arrays;

public class evenOdd {
    
    public void sort(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;
        while(nextEven < nextOdd) {
            if(A[nextEven] % 2 == 0) {
                nextEven ++;
            } else {
                int temp  = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp; 
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 8, 9, 4};
        evenOdd sorter = new evenOdd();
        sorter.sort(arr);
    }
}

// Array Question Page 60