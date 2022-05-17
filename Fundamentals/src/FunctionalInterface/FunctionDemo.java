package FunctionalInterface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String t) {
        return t.length();
    }

}

public class FunctionDemo {
    public static void main(String[] args) {

        // Function<String, Integer> function = new FunctionImpl();
        // System.out.println(function.apply("Docker"));

        Function<String, Integer> wordLength = (a) -> a.length();

        System.out.println(wordLength.apply("Kubernetes"));

    }
}
