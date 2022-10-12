package Algorithms.Recursion;

public class Greet {
    // to demostrate call stack
    private static void greet2(String name) {
        System.out.println("How are you, " + name+ "?");
    }

    private static void bye() {
        System.out.println("Ok bye!");
    }

    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("Getting ready to say bye...");
        bye();
    }

    public static void main(String[] args) {
        greet("Docker");
    }
}
