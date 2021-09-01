public class javaMethodParameters {
    
    static void myMethod(String name, int age) {
        System.out.println("Your name is " + name);
        System.out.println("Age is : " + age);
    }

    static String returnSomething(String itemToReturn) {
        return itemToReturn;
    }

    static String generationCheck(int age) {
        if(age < 16) {
            return "Child";
        } else if (age < 21) {
            return "Teenager";
        } else {
            return "Adult";
        }
    }
    
    public static void main(String[] args) {
        myMethod("Docker", 13);
        myMethod("Kubernetes", 13);

        String itemRecieved = returnSomething("Item");
        System.out.println(itemRecieved);

        String generation = generationCheck(18);
        System.out.println("You are a " + generation);

    }
}
