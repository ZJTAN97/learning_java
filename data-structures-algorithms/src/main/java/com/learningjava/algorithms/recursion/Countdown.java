package com.learningjava.algorithms.recursion;

public class Countdown {

    private static void recursionCountDown(int i) {
        System.out.println(i);

        if (i <= 0) {
            System.out.println("Count down ended");
        } else {
            recursionCountDown(i - 1);
        }

    }

    public static void main(String[] args) {
        recursionCountDown(10);
    }

}
