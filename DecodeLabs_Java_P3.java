import java.util.Scanner;

/**
 * Project 3: ATM Interface
 * Filename: DecodeLabs_Java_P3.java
 * 
 * Description:
 * A Java-based ATM interface developed using object-oriented principles.
 * Includes a BankAccount class to manage balances and an ATM class to handle user interactions.
 */

// Class to represent the user's bank account
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited: $%.2f\n", amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient balance for this transaction.");
            return false;
        }
        balance -= amount;
        System.out.printf("Successfully withdrawn: $%.2f\n", amount);
        return true;
    }
}

// Class to represent the ATM machine
class ATM {
    private BankAccount userAccount;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }

    public void start() {
        boolean running = true;
        System.out.println("Welcome to the DecodeLabs ATM!");

        while (running) {
            displayMenu();
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number (1-4).");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    handleDeposit();
                    break;
                case 3:
                    handleWithdrawal();
                    break;
                case 4:
                    System.out.println("Thank you for using DecodeLabs ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", userAccount.getBalance());
    }

    private void handleDeposit() {
        System.out.print("Enter deposit amount: $");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            userAccount.deposit(amount);
        } else {
            System.out.println("Invalid amount entered.");
            scanner.next();
        }
    }

    private void handleWithdrawal() {
        System.out.print("Enter withdrawal amount: $");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            userAccount.withdraw(amount);
        } else {
            System.out.println("Invalid amount entered.");
            scanner.next();
        }
    }
}

// Main class to run the application
public class DecodeLabs_Java_P3 {
    public static void main(String[] args) {
        // Initializing a bank account with a starting balance of $1000.00
        BankAccount myAccount = new BankAccount(1000.00);
        
        // Initializing the ATM with the created bank account
        ATM atm = new ATM(myAccount);
        
        // Starting the ATM interface
        atm.start();
    }
}
