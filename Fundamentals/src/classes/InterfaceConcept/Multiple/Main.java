package classes.InterfaceConcept.Multiple;

public class Main {
    public static void main(String[] args) {
        DemoClass myClass = new DemoClass();
        myClass.myMethod();
        myClass.myOtherMethod();
    }
}


interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}