package basics;

public class javaTypeCasting {
    public static void main(String[] args) {
        
        // Widening casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);


        // Narrow casting
        double mySecondDouble = 9.6d;
        int mySecondInt = (int) mySecondDouble;
        System.out.print(mySecondInt);


    }
}
