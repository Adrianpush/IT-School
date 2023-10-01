package session16_lambdas.live.lambda;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = (a, b, operator) -> {
            switch (operator) {
                case '+' ->  {return a + b;}
                case '-' ->  {return a - b;}
                case '*' ->  {return a * b;}
                case '/' ->  {return a / b;}
                default -> throw new IllegalArgumentException("Invalid operator");
            }
        };

        System.out.println(calculator.calculate(1,2, '+'));
    }
}
