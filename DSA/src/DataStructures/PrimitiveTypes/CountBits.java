package DataStructures.PrimitiveTypes;

public class CountBits {

    public static short countBits(int x) {
        short numBits = 0;
        while(x != 0) {
            numBits += (x & 1);
            x >>>= 1; // shifting bits to the right
        }
        return numBits;
    }

    public static void main(String[] args) {
        System.out.println(countBits(8));
    }
}



// ..... 00001000 --> 8
// ..... 00000010 --> 

// ..... 00001000 --> 4
// ..... 00000010 --> 1

// ..... 00001000 --> 2
// ..... 00000010 --> 1