package com.learningjava.algorithms.recursion;

public class Factorial {

    private static int recursiveFactorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * recursiveFactorial(x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

}
