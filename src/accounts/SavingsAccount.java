package accounts;

import interfaces.Taxable;

public class SavingsAccount extends Account implements Taxable {
    private double interestRate = 0.03;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void deductTax() {
        double tax = 0.1 * balance;
        balance -= tax;
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Savings Account: " + accountNumber + ", Balance: " + balance);
    }
}
