package basics.learning_java;

public class ArithmeticExp {
    
    public static void main(String[] args) {

        // to get floating point numbers
        double result = (double)10 / (double)3;
        System.out.println(result);

        int x = 1;
        // will assign y as 1 before ++ (prefix)
        int y = x++;
        
        x += 2;

        System.out.println(x);
        System.out.println(y);
    }
}
