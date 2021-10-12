package classes.ArrayListConcept;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Add Items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ferrari");
        cars.add("Porsche");
        System.out.println(cars);

        // Access an item
        System.out.println(cars.get(0));

        // Change an Item
        cars.set(0, "Opel");

        // Remove an Item
        cars.remove(0);

        // ArrayList Size
        cars.size();


        // Loop Through an ArrayList
        for(int i=0; i<cars.size(); i++) {
            System.out.print(cars.get(i));
            System.out.println("\n");
        }

        for(String i: cars) {
            System.out.print(i);
            System.out.println("\n");
        }

        // Sort an ArrayList
        Collections.sort(cars);

    }
}
