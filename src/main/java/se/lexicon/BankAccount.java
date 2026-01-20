package se.lexicon;

import se.lexicon.Exceptions.InsufficientBalanceException;

public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) throws InsufficientBalanceException {
        if(amount > 0) {
            balance += amount;
        } else {
            throw new InsufficientBalanceException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount <= balance) {
            balance -= amount;
        } else {
            throw new InsufficientBalanceException("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                " accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
