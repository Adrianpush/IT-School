package session16.live.lambda;

public class TestGreetingService {

    public static void main(String[] args) {
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello ".concat(message));
            }
        };

        anonymousGreetingService.greet("John");
        GreetingService lambdaGreetingService = message -> System.out.println("Hello ".concat(message));
        lambdaGreetingService.greet("Maria");
    }
}
