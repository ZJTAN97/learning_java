public class Main {
    public static void main(String[] args) {
        
        // primitive datatypes, immutable
        int hello_world = 5;
        double num2 = 5.0; // floating decimal point
        boolean b = true; // boolean true or false
        char c = '5'; // can only accept 1 character, single quotation mark

        // not primitivate datatype
        String str = "Trying to learn java and springboot.."; // double quotation marks, can accept more than 1 character

        System.out.println(hello_world);
        System.out.println(num2);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);

        // Basic Operators
        int x = 5;
        int y = 27;
        double z = 56;
        // int sum = x + y + z;
        // int multiply = x * y * z;

        double division = z / y;
        double expon = Math.pow(x, y);

        // System.out.println(sum);
        // System.out.println(multiply);
        System.out.println(division);
        System.out.println(expon);

    }
}