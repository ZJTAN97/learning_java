package HashSetConcept;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        System.out.println(cars);

        // Check if an item exists
        cars.contains("Mazda"); // returns false

        // HashSet Size
        cars.size();

        // Loop Through a HashSet
        for (String i: cars) {
            System.out.println(i);
        }

    }
}
