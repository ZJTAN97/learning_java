package FunctionalInterface;

@FunctionalInterface
interface Shape {
    void draw(); // lambda will infer from this method for return type as well.
}

public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("Draw rectangle");
        rectangle.draw();
    }
}
