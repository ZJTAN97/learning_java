package EnumConcept;

public class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // switch case with ENUMs
        switch(myVar) {
            case LOW:
              System.out.println("Low level");
              break;
            case MEDIUM:
               System.out.println("Medium level");
              break;
            case HIGH:
              System.out.println("High level");
              break;
        }


        // loop through ENUMs
        for (Level levelItems : Level.values()) {
            System.out.println(levelItems);
        }

    }
}


enum Level {
    LOW,
    MEDIUM,
    HIGH
}