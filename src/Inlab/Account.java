package Inlab;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    // No-arg constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    // Constructor with specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0; // Default value
    }

    // Accessor and mutator methods
    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public boolean setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            return true;
        }
        return false;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public boolean setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate >= 0) {
            this.annualInterestRate = annualInterestRate;
            return true;
        }
        return false;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Deposit method
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // Calculate monthly interest
    public double getMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        return balance * monthlyInterestRate;
    }
}



