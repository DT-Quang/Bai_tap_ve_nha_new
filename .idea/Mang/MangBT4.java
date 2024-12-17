package Mang;

import java.util.Scanner;

public class MangBT4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Nhập số phần tử trong mảng là : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Giá trị tại vị trí " + i + " là : ");
            arr[i] = sc.nextInt();
        }
        int o = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    o = arr[i];
                    arr[i] = arr[j];
                    arr[j] = o;
                }
            }
            System.out.print(arr[i] + " ");
        }
        MangBT4 mangBT4 = new MangBT4();
        mangBT4.getChen(arr);
    }

    public void getChen(int[] arr) {
        String chen = " Mảng sau khi thêm phần tử : ";
        System.out.println (" nhập x ");
        int x = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        int o=0;
        for(int i = 0; i < arr.length; i++) {
            if(x>arr[i]){
                newArr[i] = arr[i];
                o=i+1;
            } else{
                break;
            }
        }
        newArr[o] = x;
        for(int i=o;i<arr.length;i++){
            newArr[i+1] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            chen += newArr[i] + " ";
        }
        System.out.println(chen);
    }
}
