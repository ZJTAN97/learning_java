package Interfaces;

interface Animal {
    public void animalSound(); // interface method (does not have a body)

    public void run(); // interface method (does not have a body)
}

interface PetHabits {
    public void eat();

    public void sleep();
}

class Cat implements Animal, PetHabits {

    @Override
    public void animalSound() {

    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
