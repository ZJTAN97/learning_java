package LambdaExpressions;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    // traditional way without lambda.
    @Override
    public void draw() {
        System.out.println("Rectangle class: draw() method.");
    }

}

public class LambdaExample {

    private static void print(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {

        Shape rectangle = () -> System.out.println("Rectangle class: draw() method.");
        rectangle.draw();

        Shape square = () -> System.out.println("Square class: draw() method.");
        square.draw();

        Shape circle = () -> System.out.println("Circle class: draw() method.");
        // passing lambda expression as a parameter
        print(circle);

    }

}
