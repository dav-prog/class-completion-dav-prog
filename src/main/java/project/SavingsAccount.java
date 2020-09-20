package project;

public class SavingsAccount {
    private double balance;

    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;}

    public int getAccountNumber() {
        return 45673251;
    }

    public double getInterestRate() {
        return 0.1;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if(amount>balance){
            return;
        }
        balance = balance - amount;
    }

    public void accrueInterest() {
    }
}
