package session15.homework.challenge10;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String owner;
    private List<Stock> stockList;

    public Portfolio(String owner) {
        this.owner = owner;
        stockList = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stockList.add(stock);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(owner + "'s portfolio: "
        );
        for (Stock stock : stockList) {
            stringBuilder.append("\n ").append(stock.toString());
        }
        return stringBuilder.toString();
    }
}
