package com.bridgelabs.oop;
import java.util.Scanner;
public class Account {
    private double balance;
    public Account ( double initialBalance ) {
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    public void debit( double debitAmount ) {
        if (debitAmount > balance) {
            debitAmount = 0.0;
            System.out.println( "Debit amount exceeded account balance." );
        }
        balance = balance - debitAmount;
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args)
    {
        Account account = new Account( 150.00 );
        System.out.printf( "Account balance: $%.2f\n", account.getBalance() );

        Scanner input = new Scanner ( System.in );
        double withdrawAmount;

        System.out.print( "Enter debit amount for account : " );
        withdrawAmount = input.nextDouble();

        System.out.printf("\nDeducting %.2f from account balance\n\n", withdrawAmount );
        account.debit(withdrawAmount);
        System.out.printf( "Account Balance: $%.2f\nThank you!!", account.getBalance() );
    }
}
