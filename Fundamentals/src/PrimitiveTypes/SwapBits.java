package PrimitiveTypes;

/**
 * Problem Description
 * A 64-bit integer can be viewed as an array of 64 bits, with index 0 corresponding
 * to  the LSB and index at 63 corresponding to MSB
 * Implement code that takes as input a 64-bit integer and swap the bits
 * at indiced i and j, using a combination of bitmasks and bitwise operations
 */

public class SwapBits {

    public static long swapBits(long x, int i, int j) {

        // extract i-th and j-th bits and see if they differ
        if(((x >>> i) & 1) != ((x >>> j) & 1)) {
            // differ, swap by flipping their values.
            long bitMask = (1L << i) | (1L << j);
            System.out.println(Long.toBinaryString(bitMask));
            x ^= bitMask;
        }
        return x;
    }

    public static void unsignedAndSigned(int x) {
        // Difference between >>> and >>
        /**
         * >>> is unsigned-shift
         * >> is signed shift, extend the sign bit
         */

        /**
         * >>> will always put a 0 in the left most bit, while >> will put a 1 or a 0 
         * depending on what the sign of it is.
         */

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >>> 1));
        System.out.println(Integer.toBinaryString((x >> 1)));
        System.out.println("-----");

    }


    public static void main(String[] args) {
        System.out.println(swapBits(10, 3, 0));
        // 10 --> 1 0 1 0;
        // 0 0 1 1 -- > 3

        System.out.println("--- unsigned and signed examples ---");
        // unsignedAndSigned(121);
        // unsignedAndSigned(-121);


    }

}


