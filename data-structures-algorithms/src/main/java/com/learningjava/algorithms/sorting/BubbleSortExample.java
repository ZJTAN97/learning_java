package com.learningjava.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortExample {

    private static int[] bubbleSort(int[] numArr) {

        int temp = 0;
        int n = numArr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArr[j - 1] > numArr[j]) {
                    temp = numArr[j - 1];
                    numArr[j - 1] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }

        return numArr;
    }

    public static void main(String[] args) {
        int[] numArr = {6, 5, 4, 3, 2, 1};
        int[] sortedArr = bubbleSort(numArr);
        System.out.println(Arrays.toString(sortedArr));
    }

}
