package MaTran;

import java.util.Scanner;

public class ViDu3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Nhập số hàng cho ma trận :");
        int n = sc.nextInt();
        System.out.println(" Nhập số cột cho ma trận :");
        int m = sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" Nhập arr[ " + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Ma trận vừa lập là : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" Ma trận chuyển vị của ma trận ban đầu là : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
