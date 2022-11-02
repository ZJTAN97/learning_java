package ProcessesAndThreads;

public class ThreadRunExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample(), "t1");
        Thread t2 = new Thread(new RunnableExample(), "t2");
        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
    }
}

// Once we start any thread, its execution depends on the OS implementation of time slicing
// Cannot control their execution
// Can set Threads priority but even then it does not guarantee higher priority thread will be executed first