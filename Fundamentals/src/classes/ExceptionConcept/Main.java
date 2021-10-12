package classes.ExceptionConcept;

public class Main {

    public void checkAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The try catch is finished.");
        }

        Main myObj = new Main();
        myObj.checkAge(18);
        myObj.checkAge(16);

    }
}


