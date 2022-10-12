package Enums;


enum Level {
    LOW,
    MEDIUM,
    HIGH
}

enum Person {
    TESTER_1(60, 170),
    TESTER_2(65, 175),
    TESTER_3(70, 180);

    private final int weight;

    private final int height;

    Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    int personBMI() {
        return height / weight;
    }

}

public class EnumsExample {

    Level level;

    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println(level);

        // Loop through Enum
        for (Level types : Level.values()) {
            System.out.println(level);
        }


        // In switch statements
        switch (level) {
            case HIGH -> System.out.println("High level");
            case MEDIUM -> System.out.println("Medium Level");
            case LOW -> System.out.println("Low level");
            default -> System.out.println("Default");
        }

        // Using person enum
        Person person = Person.TESTER_1;
        System.out.println(person.personBMI());

    }

}
