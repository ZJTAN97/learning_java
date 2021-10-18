package OOP.a_classesAndObjects;

public class Dog {
    
    // Instance variables
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() {
        return name;
    }

    // method 2 
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Dog xiaoGou = new Dog("Docker", "DevOps", 13, "blue");
        xiaoGou.getName();
    }

}
