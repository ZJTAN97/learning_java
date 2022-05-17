package FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg); // contains exactly one method

    default void defaultMethod() {
    };

    static void staticMethod() {
    };

}
