package Buoi6.tknganhang;

import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        // 1. Tạo mảng 10 tài khoản với ID từ 0 đến 9 và số dư ban đầu $100
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100, 0); // Số dư ban đầu là $100
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 2. Yêu cầu người dùng nhập ID tài khoản
            int id;
            while (true) {
                System.out.print("Nhập ID tài khoản (0-9): ");
                id = scanner.nextInt();
                if (id >= 0 && id < 10) {
                    break;
                }
                System.out.println("ID không hợp lệ. Vui lòng nhập lại!");
            }

            // 3. Hiển thị menu chính cho tài khoản hợp lệ
            Account currentAccount = accounts[id];
            while (true) {
                System.out.println("\n===== MENU CHÍNH =====");
                System.out.println("1: Xem số dư");
                System.out.println("2: Rút tiền");
                System.out.println("3: Gửi tiền");
                System.out.println("4: Thoát");
                System.out.print("Lựa chọn của bạn: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: // Xem số dư
                        System.out.println("Số dư hiện tại: $" + currentAccount.getBalance());
                        break;

                    case 2: // Rút tiền
                        System.out.print("Nhập số tiền cần rút: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= 0) {
                            System.out.println("Số tiền cần rút phải lớn hơn 0.");
                        } else if (withdrawAmount > currentAccount.getBalance()) {
                            System.out.println("Rút tiền thất bại: Số dư không đủ.");
                        } else {
                            currentAccount.withdraw(withdrawAmount);
                            System.out.println("Rút tiền thành công. Số dư mới: $" + currentAccount.getBalance());
                        }
                        break;

                    case 3: // Gửi tiền
                        System.out.print("Nhập số tiền cần gửi: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount <= 0) {
                            System.out.println("Số tiền cần gửi phải lớn hơn 0.");
                        } else {
                            currentAccount.deposit(depositAmount);
                            System.out.println("Gửi tiền thành công. Số dư mới: $" + currentAccount.getBalance());
                        }
                        break;

                    case 4: // Thoát
                        System.out.println("Đăng xuất tài khoản " + id + ". Quay lại màn hình chính.");
                        break;

                    default: // Lựa chọn không hợp lệ
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                }

                if (choice == 4) { // Thoát khỏi vòng lặp menu
                    break;
                }
            }
        }
    }
}
