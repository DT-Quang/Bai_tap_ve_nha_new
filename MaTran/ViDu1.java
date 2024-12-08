package MaTran;

import java.util.Scanner;

public class ViDu1 {
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
        ViDu1 viDu1 = new ViDu1();
        viDu1.getTong(arr);
        viDu1.getMaxMin(arr);
    }
    void getTong ( int [][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(" Tổng các phần tử trong ma trận là : ");
        System.out.println(sum);
    }
    void getMaxMin( int[][] arr){
        int max=0;
        int min=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(" Giá trị lớn nhất trong ma trận là : " + max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println(" Giá trị nhỏ nhất trong ma trận là : " + min);
    }
}
