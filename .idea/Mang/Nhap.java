package Mang;

import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" giá trị phần tử tại vị trí " + i);
            arr[i] = sc.nextInt();
        }
        Nhap nhap = new Nhap();
        nhap.getDuyet(arr);
    }

    public void getDuyet(int[] arr) {
        String pTxhnn = " Các phần tử được lặp lại nhiều nhất là : ";
        int maxDuyet = 0;
        int pTXHNN = arr[0];
        // B1 tinh so lan xuat hien cua moi gia tri
        int[] mangTam = new int[1000000];
        for (int j = 0; j < arr.length; j++) {
            mangTam[arr[j]]++;
        }
        //B2 tim mã xuat hien
        for (int i = 0; i < arr.length; i++) {
            int dem = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            if (maxDuyet < dem) {
                maxDuyet = dem;
            }
        }
        // B3 duyt lai
        for (int j = 0; j < mangTam.length; j++) {
            if (mangTam[j] == maxDuyet) {
                System.out.println(" " + j);
            }

        }
    }
}
