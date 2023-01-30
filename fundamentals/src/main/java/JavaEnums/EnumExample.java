package JavaEnums;

public class EnumExample {

    public static void main(String[] args) {
        Person person = Person.TESTER_1;
        System.out.println(person.personBMI());

        switch (person) {
            case TESTER_1 -> System.out.println("Tester 1");
            case TESTER_2 -> System.out.println("Tester 2");
            case TESTER_3 -> System.out.println("Tester 3");
            default -> System.out.println("Default");
        }

    }

}
