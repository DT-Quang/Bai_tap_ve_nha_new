package Buoi6.tknganhang;

import java.util.Date;

public class Account {

    // thuộc tính
    private int id;
    private double balance;
    private double annualInterestRate; // tính theo %
    private Date dateCreated;

    // hàm khởi tạo mặc định
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date(); // tính ngày hiện tại
    }

    // Hàm khởi tạo đầy đủ thông tin
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date(); // Ngày hiện tại
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Phương thức tính lãi suất hàng tháng
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Phương thức tính tiền lãi hàng tháng
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Rút tiền thất bại: Số dư không đủ.");
        } else {
            balance -= amount;
        }
    }

    // Phương thức gửi tiền
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        } else {
            balance += amount;
        }
    }


}
