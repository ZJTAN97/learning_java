package FibonacciSequence;

public class Fibonacci {


    public int recursiveMethod(int n) {
        // lacks efficiency
        if(n <= 2) return 1;
        return recursiveMethod(n-1) + recursiveMethod(n-2);
    }
    // O(2^n) time
    // O(n) Space


    // 23:50
    // https://www.youtube.com/watch?v=oBt53YbR9Kk




    public static void main(String[] args) {
        
        Fibonacci fib = new Fibonacci();
        
        System.out.println(fib.recursiveMethod(7));



    }
}
