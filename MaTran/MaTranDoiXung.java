package MaTran;

import java.util.Scanner;

public class MaTranDoiXung {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Nhập kích thước cho ma trận n x n :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" Nhập arr[ " + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Ma trận vừa lập là : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean kiemTra = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                if(arr[i][j] != arr[j][i]){
                   kiemTra = false;
                   break;
                }
                if(!kiemTra){
                    break;
                }
            }
        }
        if(kiemTra){
            System.out.println(" Ma trận là ma trận đối xứng .");
        } else {
            System.out.println(" Ma trận không phải là ma trận đối xứng .");
        }
    }
}
