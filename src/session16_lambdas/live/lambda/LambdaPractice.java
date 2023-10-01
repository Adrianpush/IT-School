package session16_lambdas.live.lambda;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        System.out.println(getSum.sum(1,1));

        IntMultiply getMultiply = (a, b) -> a * b;
        System.out.println(getMultiply.multiply(2,2));
    }
}
