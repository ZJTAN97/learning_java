package interfaces.a_interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.display();
    }
}


interface Simple {
    final int a = 10;
    void display();
}

class TestClass implements Simple {
    public void display() {
        System.out.println("Implemented display.");
    }
}
