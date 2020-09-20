package project;

public class SavingsAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;}

    public int getAccountNumber() {
        return 45673251;
    }

    public double getInterestRate() {
        return interestRate;
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
        balance = balance + balance * getInterestRate();

    }

}
