package com.bridgelabs.oop;
import java.util.Scanner;
public class Stock {

        public static void main(String[] args) {
            int flag = 1;
            Scanner sc = new Scanner(System.in);
            StockPortfolio p = new StockPortfolio();

            while (flag == 1)
            {
                System.out.println("Enter the details of stock ");
                StockPortfolio.Stock s = new StockPortfolio.Stock();
                System.out.print("Enter stock name: ");
                s.company = sc.nextLine();
                System.out.print("Enter number of shares: ");
                s.NoOfShare = sc.nextInt();
                System.out.print("Enter price of share: ");
                s.price = sc.nextDouble();
                p.portfolio.add(s);
                System.out.println("Do you want to add more Stocks(1/0)");
                flag = sc.nextInt();
            }
            for (int i = 0; i < p.portfolio.size(); i++){
                p.totalValue();}
            System.out.println("Total value of Stock :- " + p.totalValue());
        }
}

