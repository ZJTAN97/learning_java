package LambdaExpressions;

public class LambdaRunableExample {

    public static void main(String[] args) {
        
        Runnable runnable = () -> System.out.println("run method called using lambda.");
        Thread threadLambda = new Thread(runnable);
        threadLambda.start();

    }

}
