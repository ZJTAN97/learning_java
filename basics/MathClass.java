package basics.learning_java;

public class MathClass {
    public static void main(String[] args) {

        int result = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.1F); // gets 2
        int result3 = (int)Math.floor(1.1F); // gets 1

        int max = Math.max(1,2); // gets 2
        int min = Math.min(1,2); // gets 1
        double random = Math.random(); // gets between 0,1
        int test = (int) Math.round(Math.random() * 100);

        System.out.print(test);

    }
}
