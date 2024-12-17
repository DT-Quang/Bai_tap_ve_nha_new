package Mang;

import java.util.Scanner;

public class MangBT5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(" Nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
            arr[i] = sc.nextFloat();
        }
        MangBT5 mangBT5 = new MangBT5();
        mangBT5.getTang(arr);
    }
    void getTang(float[] arr){
        float m;
        String tangDan = "";
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    m = arr[i];
                    arr[i] = arr[j];
                    arr[j] = m;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            tangDan+=arr[i]+" ";
        }
        System.out.println(tangDan);
    }
}
