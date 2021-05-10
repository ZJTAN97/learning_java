package basics.learning_java;

import java.util.Date;
import java.util.Arrays;
import java.awt.*;

public class Main {
    
    public static void main(String[] args) {
        // Set the length of arrays
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        // new way to initialize arrays
        int [] numbers2 = {2, 3, 5, 1, 4};
        System.out.println(numbers2.length);

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        
        // Multi-dimensional Arrays
        int [][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;

        System.out.println(Arrays.deepToString(numbers3));

        int [][] numbers4 = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers4));




    }

}
