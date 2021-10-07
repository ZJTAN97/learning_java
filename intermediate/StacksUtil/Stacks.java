import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        myStack.push("bottom");
        printStack(myStack);
        myStack.push("2nd");
        printStack(myStack);
        myStack.push("3rd");
        printStack(myStack);

        myStack.pop();
        printStack(myStack);
        myStack.pop();
        printStack(myStack);        
        myStack.pop();
        printStack(myStack);
    }

    private static void printStack(Stack<String> s) {
        if(s.isEmpty()) {
            System.out.println("Nothing in myStack.");
        } else {
            System.out.printf("%s TOP\n", s);
        }
    }

}
