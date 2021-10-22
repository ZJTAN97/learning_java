package inheritance_polymorphism.c_polymorphism;

public class methodOverloading {
    public static void main(String[] args) {
        MultiplyFun.Multiply(10.5, 10.5);
        MultiplyFun.Multiply(10, 10);
    }
}


class MultiplyFun {
    static int Multiply(int a, int b) {
        return a * b;
    }
    static double Multiply(double a, double b) {
        return a * b;
    }
}