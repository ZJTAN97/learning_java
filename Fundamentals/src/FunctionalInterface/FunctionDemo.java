package FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, Integer> wordLength = (a) -> a.length();

        System.out.println(wordLength.apply("Kubernetes"));

    }
}
