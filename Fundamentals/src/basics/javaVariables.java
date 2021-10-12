package basics;

/*

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or falses

Final Variables --> cannot overwrite (declare the varialbe as final or constant)


*/

public class javaVariables {
    public static void main(String[] args) {
        

        // variable of type String
        String name = "John";
        System.out.println(name);


        // variable of type Number
        int myNum = 15;
        System.out.println(myNum);

        // can declare and use it later
        int useLater;

        // Final Variables
        final int noChange = 13;


    }
}
