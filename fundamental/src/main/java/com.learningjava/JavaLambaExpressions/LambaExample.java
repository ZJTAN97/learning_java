package JavaLambaExpressions;

public class LambaExample {

    private static void print(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("Drawing rectangle");
        rectangle.draw();

        Shape square = () -> System.out.println("Drawing square");
        square.draw();

        Shape circle = () -> System.out.println("Drawing circle");
        print(circle);

    }

}
