package Mang;

import java.util.Scanner;

public class MangBT7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        MangBT7 mangBT7 = new MangBT7();
        mangBT7.getTim(arr);
        mangBT7.getSX(arr);
        mangBT7.getChen(arr);
    }

    void getTim(int[] arr) {
        int max1 = -1, max2 = -1;
        int max1i = 0, max2i = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max2i = max1i;
                max1 = arr[i];
                max1i = i;
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
                max2i = i;
            }
        }
        System.out.println(" Giá trị lớn nhất nằm ở vị trí " + max1i + " là : " + max1);
        System.out.println(" Giá trị lớn thứ hai nằm ở vị trí " + max2i + " là : " + max2);
    }

    void getSX(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(" Mảng sau khi được sắp xếp lại : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void getChen(int[] arr) {
        System.out.println(" Nhập x ");
        int x = sc.nextInt();
        int l=0;
        int[] brr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < x){
                brr[i] = arr[i];
                l=i+1;
            }
        }
        brr[l]=x;
        for(int i = l ; i<arr.length; i++){
            brr[i+1]=arr[i];
        }
        System.out.println(" Mảng sau khi chèn " + x + " là :");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
    }
}
