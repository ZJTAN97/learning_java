package abstraction_encapsulation.c_encapsulation;

public class EncapsulationConcept {
    public static void main(String[] args) {

        Encapsulate person = new Encapsulate();
        person.setAge(18);
        System.out.println(person.getAge());


        // direct access not possible due to encapsulation
        // System.out.println(person.myName);
         
    }
}


class Encapsulate {
    private String myName;
    private int myAge;

    public int getAge() {
        return myAge;
    }

    public String getName() {
        return myName;
    }


    public void setAge(int age) {
        myAge = age;
    }

    public void setName(String name) {
        myName = name;
    }

}