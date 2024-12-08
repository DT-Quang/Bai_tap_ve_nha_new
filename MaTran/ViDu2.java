package MaTran;

import java.util.Scanner;

public class ViDu2 {
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
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==j|| (i+j)==(n-1)){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(" Tổng các phần tử trên đường chéo chính của ma trận là : " + (sum));
        ViDu2 viDu2 = new ViDu2();
        viDu2.getTongHangCot(arr);
    }
    void getTongHangCot(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println(" Tổng các phần tử ở hàng " + i + " là : " + sum);
        }
        for ( int j=0 ; j < arr[0].length; j++){
            int sum1=0;
            for(int i=0;i<arr.length;i++){
                sum1+=arr[i][j];
            }
            System.out.println(" Tổng các phần tử ở cột " + j + " là : " + sum1);
        }
    }
}
