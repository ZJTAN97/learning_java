package Algorithms.Recursion;

public class Countdown {

    private static void countdown(int i) {
        System.out.println(i);
        if (i<=0) {
            System.out.println("Count down ended");
        }  else {
            countdown(i-1);
        }
    }

    public static void main(String[] args) {
        countdown(10);
    }
}
