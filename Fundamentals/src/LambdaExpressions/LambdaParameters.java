package LambdaExpressions;

interface Add {
    int addition(int a, int b);
}

public class LambdaParameters {

    public static void main(String[] args) {
        Add AddImpl = (a, b) -> a + b;
        int answer = AddImpl.addition(5, 10);
        System.out.println(answer);
    }
}
