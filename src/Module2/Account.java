package Module2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private Employee employeeInCharge;
    private List<Transaction> transactions;

    public Account(String accountNumber, String accountHolder, double balance, Employee employeeInCharge) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.employeeInCharge = employeeInCharge;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction(UUID.randomUUID().toString(), this, employeeInCharge, "Deposit", amount));
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction(UUID.randomUUID().toString(), this, employeeInCharge, "Withdraw", amount));
            return true;
        }
        return false;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

}
