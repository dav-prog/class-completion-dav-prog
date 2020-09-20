package project;

public class SavingsAccount {
    private double balance = 10.10;
    private int accountNumber = 45673251;
    private double interestRate = 0.1;

    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;}

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        amount = 9.99;
        double newBalance = balance + amount;
        balance = newBalance;
    }
}
