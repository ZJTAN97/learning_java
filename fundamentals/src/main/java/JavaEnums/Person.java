package JavaEnums;

public enum Person {
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
