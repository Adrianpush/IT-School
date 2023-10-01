package session16_lambdas.live.lambda;

public class LambdaAndThreads {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a distinct thread.");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
