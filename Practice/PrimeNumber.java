package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số cần kiểm tra : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.print(n + " là số nguyên tố .");
        } else {
            System.out.print(n + " không phải là số nguyên tố .");
        }
    }
}
