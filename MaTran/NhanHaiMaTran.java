package MaTran;

import java.util.Scanner;

public class NhanHaiMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận A: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận A và số hàng của ma trận B: ");
        int n = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận B: ");
        int p = scanner.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][p];

        System.out.println("Nhập các phần tử của ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử của ma trận B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Ma trận kết quả C là:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
