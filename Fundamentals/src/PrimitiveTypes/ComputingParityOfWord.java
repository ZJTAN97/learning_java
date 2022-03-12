package PrimitiveTypes;

public class ComputingParityOfWord {

    public static short parity(long x) {
        short result = 0;
        while (x != 0) {
            System.out.println(x);
            result ^= 1;
            x &= (x-1); // refer to guide below
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(parity(7));
    }
}



/**
 * Problem Description
 * Parity of a binary word is 1 if number of 1s in the word is odd
 * Else it is 0
 * 
 * E.g. 
 * 1011 --> 1
 * 10001000 --> 0s
 */


 /**
  * Clearing of lowest set bit
  7 --> 0111
  6 --> 0110
  4 --> 0100

  Notice how the 1s get turned to 0.
  */