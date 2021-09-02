public class JavaClassMethods {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects.");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {

        myStaticMethod(); // no error
        // myPublicMethod(); // compile an error

        JavaClassMethods myObj = new JavaClassMethods();
        myObj.myPublicMethod(); // like that ok        
    }
}