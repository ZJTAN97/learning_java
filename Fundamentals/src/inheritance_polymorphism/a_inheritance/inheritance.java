package inheritance_polymorphism.a_inheritance;

public class inheritance {
    public static void main(String[] args) {
        
        MountainBike mb = new MountainBike(10, 10, 5);

        mb.applyBrake(10);
        
        System.out.println(mb.toString());

    }
}

// base class
class Bicycle {
    // Bicycle class has two fields
    public int gear;
    public int speed;

    // Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);    
    }
}


// derived class
class MountainBike extends Bicycle {

    // MountainBike subclass requires one more field.
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        // invoking base-class (Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }

}