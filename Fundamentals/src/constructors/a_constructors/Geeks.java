package constructors.a_constructors;

class Geeks {

    // data members of the class.
    String name;
    int id;

    // Constructor
    Geeks (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        
        Geeks geek1 = new Geeks("Docker", 13);

        System.out.println(geek1.id);
        System.out.println(geek1.name);

    }
}


class Geeks2 {
    // to demostrate overloading of constructor
    Geeks2 (String name) {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }

    Geeks2(String name, int age) {
        System.out.println("Constructor with two arguments : " +
        " String and Integer : " + name + " "+ age);
    }

    Geeks2(long id) {
        System.out.println("Constructor with one argument : " +
        "Long : " + id);
    }

    public static void main(String[] args) {
        Geeks2 geeks2 = new Geeks2("Kubernetes"); // demo string
        Geeks2 geeks3 = new Geeks2("Docker", 13); // demo string + int
        Geeks2 geeks4 = new Geeks2(1231231123); // demo long
    }

}