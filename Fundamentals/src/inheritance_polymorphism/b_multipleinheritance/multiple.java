package inheritance_polymorphism.b_multipleinheritance;

public class multiple {

    public static void main(String[] args) {
        TestClass d = new TestClass();
        d.show();
        d.show2();
    }
    
}


interface PI1 {
    // default method
    default void show() {
        System.out.println("Default PI1");
    }
}


interface PI2 {
    default void show() {
        System.out.println("Default PI2");
    }
}


class TestClass implements PI1, PI2 {

    public void show() {
        PI1.super.show();
        PI2.super.show();
        System.out.println("wdf");
    }

    public void show2() {
        System.out.println("wdf2");
    }

}