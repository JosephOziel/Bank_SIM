package users;

import accounts.Account;

public class Admin {
    public void printBalance(Account account) {
        System.out.println("Account Balance: " + account.getBalance());
    }
}