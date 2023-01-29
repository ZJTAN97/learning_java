package Reflection;

public class Cat {

    private final String name;

    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void meow() {
        System.out.println("meowing.");
    }

    public static void staticMeow() {
        System.out.println("static meowing.");
    }

}
