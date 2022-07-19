package com.bridgelabs.oop;
import java.util.ArrayList;

class StockPortfolio{
    ArrayList<Stock> portfolio = new ArrayList<>();
    double totalValue = 0;
    static class Stock {
        int NoOfShare;
        String company;
        double price;
    }
    public double totalValue() {
        for (int i = 0, portfolioSize = portfolio.size(); i < portfolioSize; i++) {
            Stock stock = portfolio.get(i);
            totalValue = stock.price * stock.NoOfShare;
            totalValue += totalValue;
        }
        return totalValue;
    }
}
