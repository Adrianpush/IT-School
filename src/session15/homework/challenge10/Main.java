package session15.homework.challenge10;

public class Main {

    public static void main(String[] args) {
        Portfolio myPortfolio = new Portfolio("Adrian");
        myPortfolio.addStock(new Stock("Apple Inc", "AAPL", 175.01));
        myPortfolio.addStock(new Stock("Microsoft Corp", "MSFT", 330.22));
        myPortfolio.addStock(new Stock("Advanced Micro Devices Inc", "AMD", 101.49));

        System.out.println(myPortfolio);
    }
}
