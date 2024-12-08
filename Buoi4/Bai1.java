package Buoi4;

import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Nhập số phần tử của mảng ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị tại vị trí " + i);
            arr[i] = sc.nextInt();
        }
        hienThi(arr);
        System.out.println();
        sum(arr);
        System.out.println();
        timSo(arr);
        System.out.println();
        sapXep(arr);
    }

    public static void hienThi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void timSo(int[] arr) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void sapXep(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        hienThi(arr);
    }
}
