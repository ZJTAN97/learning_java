package inheritance_polymorphism.a_inheritance;

public class inheritanceMultiLevel {
    public static void main(String[] args) {
        three g = new three();
        g.print_geek();
        g.method_one();
    }
}


class one {
    public void print_geek() {
        System.out.println("Geeks");
    }
    public void method_one() {
        System.out.println("method one");
    }
}
 
class two extends one {
    public void print_for() { 
        System.out.println("for"); 
    }
}
 
class three extends two {
    public void print_geek() {
        System.out.println("Geeks");
    }
}