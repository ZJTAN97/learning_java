package JavaArray;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        // add items
        cars.add("Tesla");
        cars.add("Chevrolet");
        cars.add("Kubernetes");
        cars.add("React");

        Collections.sort(cars);

        // access item
        cars.get(0);

        // Change item
        // cars.set(5, "Docker"); // index out of bound error
        cars.set(1, "Docker");


        // Remove all items
        // cars.clear();

        // loop through arraylist
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(cars);

    }

}
