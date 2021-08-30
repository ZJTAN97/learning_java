public class javaMethodParameters {
    
    static void myMethod(String name, int age) {
        System.out.println("Your name is " + name);
        System.out.println("Age is : " + age);
    }

    static String returnSomething(String itemToReturn) {
        return itemToReturn;
    }
    
    public static void main(String[] args) {
        myMethod("Docker", 13);
        myMethod("Kubernetes", 13);

        String itemRecieved = returnSomething("Item");
        System.out.println(itemRecieved);
    }
}
