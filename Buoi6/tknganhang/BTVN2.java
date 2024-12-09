package Buoi6.tknganhang;

public class BTVN2 {
    public static void main(String[] args) {
        // Tạo đối tượng Account
        Account account = new Account(1122, 20000, 4.5);

        // Rút 2,500 USD
        account.withdraw(2500);

        // Gửi 3,000 USD
        account.deposit(3000);

        // In ra thông tin tài khoản
        System.out.println("Số dư hiện tại: $" + account.getBalance());
        System.out.println("Tiền lãi hàng tháng: $" + account.getMonthlyInterest());
        System.out.println("Ngày tài khoản được tạo: " + account.getDateCreated());
    }
}
