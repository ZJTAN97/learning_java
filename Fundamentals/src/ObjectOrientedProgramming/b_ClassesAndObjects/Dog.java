package ObjectOrientedProgramming.b_ClassesAndObjects;

public class Dog {
    
    // Instance variables
    String name;
    String breed;
    int age;
    String color;

    // Constructor
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (
            "Hi my name is" + this.getName()
        );
    }

    public static void main(String[] args) {
        Dog tuffy = new Dog("Tuffy", "Papillon", 5, "White");
        System.out.println(tuffy.toString());
    }
  
}
