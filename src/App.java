import accounts.*;
import users.*;

public class App {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000);
        CheckingAccount checking = new CheckingAccount("CA456", 500);

        Customer alice = new Customer("Alice", savings);
        Customer bob = new Customer("Bob", checking);

        alice.deposit(500);
        alice.withdraw(200);
        savings.applyInterest();
        savings.deductTax();

        bob.withdraw(700); // overdraft test

        alice.showDetails();
        bob.showDetails();

        Admin admin = new Admin();
        admin.printBalance(savings);
    }
}
