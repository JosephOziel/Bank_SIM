package users;

import accounts.Account;

public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void showDetails() {
        System.out.println("Customer: " + name);
        account.printAccountDetails();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}