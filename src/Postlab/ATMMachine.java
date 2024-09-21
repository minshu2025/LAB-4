package Postlab;

import java.util.Scanner;

public class ATMMachine {
    private Account[] accounts;

    public ATMMachine() {
        accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i + 1); // IDs from 1 to 10
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account ID (0 to exit): ");
            int id = scanner.nextInt();

            if (id == 0) {
                break;
            }

            if (id < 1 || id > 10) {
                System.out.println("Invalid ID. Please enter an ID between 1 and 10.");
                continue;
            }

            Account account = accounts[id - 1];

            while (true) {
                System.out.println("\nMain Menu:");
                System.out.println("1: View balance");
                System.out.println("2: Withdraw money");
                System.out.println("3: Deposit money");
                System.out.println("4: Exit menu");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // View balance
                        System.out.println("Current balance: $" + account.getBalance());
                        break;
                    case 2:
                        // Withdraw money
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        // Deposit money
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 4:
                        // Exit menu
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.start();
    }
}

