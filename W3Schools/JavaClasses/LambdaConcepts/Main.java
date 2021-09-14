package LambdaConcepts;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(13);
        numbers.add(18);
        numbers.forEach((n) -> {System.out.println(n);});

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach(method);

    }
}
