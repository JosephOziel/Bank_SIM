package accounts;

public class CheckingAccount extends Account {
    private double overdraftLimit = 500.0;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
        }
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Checking Account: " + accountNumber + ", Balance: " + balance);
    }
}
