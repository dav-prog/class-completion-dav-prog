package project;

public class SavingsAccount {
    private double balance = 10.1;

    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        this.balance = balance;
    }

    public double getBalance() {return balance;}
}
