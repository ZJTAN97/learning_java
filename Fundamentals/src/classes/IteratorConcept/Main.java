package classes.IteratorConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        Iterator<String> it = cars.iterator();

        // Print first item
        System.out.println(it.next());

        // Looping through a collection
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        // Removing Items from a collection
        while(it.hasNext()) {
            String i = it.next();
            System.out.println(i);
            if(i=="BMW") {
                it.remove();
            }
        }

        System.out.println(cars);

    }
}
