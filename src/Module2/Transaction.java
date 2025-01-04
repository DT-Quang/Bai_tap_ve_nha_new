package Module2;

import java.time.LocalDateTime;

public class Transaction {

    private String transactionId;
    private Account account;
    private Employee employee;
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String transactionId, Account account, Employee employee, String type, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.employee = employee;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Type: " + type + ", Amount: " + amount + ", Time: " + timestamp;
    }
}
