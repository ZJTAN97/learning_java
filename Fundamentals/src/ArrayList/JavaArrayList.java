package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();

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
        for(int i=0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println(cars);

    }
}
