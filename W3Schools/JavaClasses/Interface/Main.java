package Interface;

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}


interface Animal {
    public void animalSound();
    public void sleep();
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        System.out.println("Oink");
    }
    public void sleep() {
        System.out.println("zzz");
    }
}