package Postlab;

public class Account {
    private int id;
    private double balance;

    public Account(int id) {
        this.id = id;
        this.balance = 100.0; // Initial balance of $100
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

