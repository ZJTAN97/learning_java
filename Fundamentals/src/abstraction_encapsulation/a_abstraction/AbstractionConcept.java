package abstraction_encapsulation.a_abstraction;

public class AbstractionConcept {
    public static void main(String[] args) {

        Circle circle = new Circle("Blue", 50);
        System.out.println(circle.toString());
        
    }
}


abstract class Shape {
    String color;

    // Abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class constructor
    public Shape(String color) {
        System.out.println("Constructor called.");
        this.color = color;
    }

    // concrete method
    public String getColor() {
        return color;
    }
}


class Circle extends Shape {
    double radius;

    // circle constructor
    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle Constructor called.");
        this.radius = radius;
    }


    @Override 
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor()
            + " and area is : " + area(); 
    }

}