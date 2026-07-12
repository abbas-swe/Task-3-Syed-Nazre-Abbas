# ATM Interface (DecodeLabs_Java_P3)

## Project Overview

This project develops a command-line-based Automated Teller Machine (ATM) interface using Java, adhering to Object-Oriented Programming (OOP) principles. It simulates basic ATM functionalities such as checking balance, depositing funds, and withdrawing cash, all while interacting with a `BankAccount` class that manages the account's state.

## Features

*   **Object-Oriented Design**: Utilizes separate classes for `BankAccount` and `ATM` to promote modularity, encapsulation, and reusability.
*   **Balance Inquiry**: Allows users to view their current account balance.
*   **Deposit Functionality**: Enables users to deposit funds into their account, with validation for positive amounts.
*   **Withdrawal Functionality**: Permits users to withdraw cash, including checks for sufficient balance and positive withdrawal amounts.
*   **Input Validation**: Robustly handles user input, ensuring valid numeric entries for transactions and preventing invalid operations.
*   **Clear Transaction Messages**: Provides informative messages for all transactions, indicating success or failure and reasons for any errors.
*   **Interactive Menu**: Guides the user through available options with a simple, easy-to-navigate menu.

## How to Use

1.  Upon starting the application, you will be greeted with a welcome message and the main ATM menu.
2.  Choose an option by entering the corresponding number (1-4).
    *   **1. Check Balance**: Displays your current account balance.
    *   **2. Deposit**: Prompts you to enter an amount to deposit. The amount must be positive.
    *   **3. Withdraw**: Prompts you to enter an amount to withdraw. The amount must be positive and not exceed your current balance.
    *   **4. Exit**: Terminates the ATM session.
3.  Follow the on-screen prompts for each transaction.

## Key Concepts Demonstrated

*   **Classes & Objects**: Implementation of `BankAccount` and `ATM` as distinct classes, with objects representing instances of these entities.
*   **Encapsulation**: Private fields (`balance` in `BankAccount`) and public methods (`deposit`, `withdraw`, `getBalance`) to control access and maintain data integrity.
*   **Methods**: Well-defined functions within classes to perform specific actions (e.g., `deposit`, `withdraw`, `displayMenu`).
*   **Input Handling (`java.util.Scanner`)**: For reading user input from the console.
*   **Conditional Statements (`if-else`, `switch`)**: Used for transaction validation, menu navigation, and error handling.
*   **Loops (`while`)**: To keep the ATM running until the user chooses to exit.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 8 or higher installed on your system.

### Running the Application

1.  **Save the file**: Save the provided Java code as `DecodeLabs_Java_P3.java`.
2.  **Compile**: Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac DecodeLabs_Java_P3.java
    ```
3.  **Run**: After successful compilation, execute the application using the Java Virtual Machine:
    ```bash
    java DecodeLabs_Java_P3
    ```

# Task-3-Syed-Nazre-Abbas
