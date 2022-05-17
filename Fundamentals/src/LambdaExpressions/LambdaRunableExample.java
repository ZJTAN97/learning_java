package LambdaExpressions;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method called..");
    }

}

public class LambdaRunableExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = () -> System.out.println("run method called using lambda.");
        Thread threadLambda = new Thread(runnable);
        threadLambda.start();

    }

}
