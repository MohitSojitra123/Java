// Abstract class
abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method
    abstract void calculateInterest();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    final double interestRate = 0.08; // 8%

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings Account Interest: " + interest);
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    final double interestRate = 0.05; // 5%

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Current Account Interest: " + interest);
    }
}

// Test class
public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10000); // Example balance
        CurrentAccount ca = new CurrentAccount(20000); // Example balance

        sa.calculateInterest();
        ca.calculateInterest();
    }
}

