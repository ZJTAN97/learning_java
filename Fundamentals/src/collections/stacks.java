package collections;

import java.util.Iterator;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Docker");
        stack.push("Kubernetes");

        // Iterator for stack
        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        stack.pop();

        System.out.println(stack);


    }
}
