import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numArr = {6, 5, 4, 3 ,2 ,1};
        int[] sortedArr = selectionSortMethod(numArr);

        System.out.println(Arrays.toString(sortedArr));
        
    }

    public static int[] selectionSortMethod(int[] numArr) {

        int n = numArr.length;
        int temp = 0;
        
        // One by one move boundary of unsorted subarray
        for(int i=0; i < n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j < n; j++) {
                if(numArr[j] < numArr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found min element with the first element
            temp = numArr[minIndex];
            numArr[minIndex] = numArr[i];
            numArr[i] = temp;
            
        }

        return numArr;
    }
}
