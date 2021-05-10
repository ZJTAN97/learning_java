package basics.learning_java;

public class Casting {

    public static void main(String[] args) {

        // implicit casting (automatic conversion)
        // byte > short > int > long > float > double (compatible types)
        String c = "5";
        short x = 1;
        int y = x + 2 + Integer.parseInt(c);

        // explicit casting
        double a = 1.1;
        int b = int(a) + 2;
    }

}
