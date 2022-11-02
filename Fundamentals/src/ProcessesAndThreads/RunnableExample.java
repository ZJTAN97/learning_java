package ProcessesAndThreads;

public class RunnableExample implements Runnable {

    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample();
        runnableExample.run();
    }

    @Override
    public void run() {
        System.out.println("START: " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);

            // Mock DB Connection
            databaseProcess();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END: " + Thread.currentThread().getName());
    }

    private void databaseProcess() throws InterruptedException {
        Thread.sleep(5000);
    }
}
