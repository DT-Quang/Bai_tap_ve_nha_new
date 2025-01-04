package Module2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {

    private static Map<String, Account> accounts = new HashMap<>();
    private static Map<String, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Account\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    String empId = scanner.nextLine();
                    Employee emp = employees.get(empId);
                    if (emp == null) {
                        System.out.println("Employee not found!");
                        break;
                    }
                    Account newAccount = new Account(accNumber, accHolder, balance, emp);
                    accounts.put(accNumber, newAccount);
                    emp.addAccount(newAccount);
                    System.out.println("Account created successfully!");
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accNumber = scanner.nextLine();
                    Account acc = accounts.get(accNumber);
                    if (acc == null) {
                        System.out.println("Account not found!");
                        break;
                    }
                    System.out.print("Enter Deposit Amount: ");
                    double amount = scanner.nextDouble();
                    acc.deposit(amount);
                    System.out.println("Deposit Successful!");
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNumber = scanner.nextLine();
                    acc = accounts.get(accNumber);
                    if (acc == null) {
                        System.out.println("Account not found!");
                        break;
                    }
                    System.out.print("Enter Withdrawal Amount: ");
                    amount = scanner.nextDouble();
                    if (acc.withdraw(amount)) {
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
