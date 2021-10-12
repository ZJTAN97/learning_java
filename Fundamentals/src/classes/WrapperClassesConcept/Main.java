package classes.WrapperClassesConcept;

public class Main {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        char myChar2 = 'B'; // cannot access methods
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(myChar2);


        String newString = myDouble.toString();
        System.out.println(newString);

    }
}
