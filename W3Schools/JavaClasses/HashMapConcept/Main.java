package HashMapConcept;

// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    

    // get item
    String englandCapital = capitalCities.get("England");
    System.out.println(englandCapital);

    // remove item
    capitalCities.remove("England");


    // Loop through keys
    for (String i : capitalCities.keySet()) {
        System.out.println(i);
    }

    // Loop through items
    for (String i: capitalCities.values()) {
        System.out.println(i);
    }

  }
}
