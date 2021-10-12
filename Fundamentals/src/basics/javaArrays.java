package basics;

public class javaArrays {
    public static void main(String[] args) {

        // Creating arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Access elements of an Array
        System.out.println(cars[0]); // Outputs Volvo


        // Change an Array Element
        cars[0] = "New Car";
        System.out.println(cars[0]); // New Car

        
        // Array Length
        System.out.println(cars.length); // 4


        // Loop through an Array
        for(int i=0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        // Loop Through an Array with For-Each
        for (String i : cars) {
            System.out.println(i);
        }


        // Multi-dimensional Arrays
        int[][] myNumbers = { {1,2,3}, {4,5,6} };

        for(int i=0; i < myNumbers.length; i++) {
            for(int j=0; j < myNumbers[i].length; j ++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
