package Inlab;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf("Account ID: %d%n", account.getId());
        System.out.printf("Balance: $%.2f%n", account.getBalance());
        System.out.printf("Monthly Interest: $%.2f%n", account.getMonthlyInterest());
    }
}
