public class Recursion {
    
    //main
    public static void main(String args[]) {
        System.out.println(fact(5));
    }

    // fact
    public static long fact(long n) {
        if(n <= 1)
            return 1; // base case
        else 
            // a method that calls itself
            return n * fact(n-1);
    }

}

// recursion
// tries to solve itself, and if it cant, it stores in memory
// then once it reach base case, it will step itself back up to solve