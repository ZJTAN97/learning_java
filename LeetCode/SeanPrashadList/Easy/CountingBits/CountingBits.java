import java.util.*;

public class CountingBits {

    static int[] countBits(int n) {

        int[] arr = new int[n+1];
        Arrays.setAll(arr, i -> i);
        int[] solution = new int[n+1];

        for(int i=0; i < arr.length; i++) {
            String binaryString = Integer.toBinaryString(arr[i]);
            solution[i] = binaryString.length() - binaryString.replace("1", "").length(); // count number of "1"
        }

        return solution;
    }

    // 3 Liner Solution
    // * Right Shifting binary numbers would divide a number by 2
    // * Left shifting binary numbers would multiply a number by 2
    static int[] countBits2(int n) {

        int[] arr = new int[n+1];
        for (int i=1; i<n; i++) {
            // arr[i] = arr[i >> 1] + (i & 1);
            arr[i] = arr[i/2] + ( i & 1);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    
    public static void main(String[] args) {

        countBits(2);
        countBits(5);
        countBits2(5);
        
    }
}
