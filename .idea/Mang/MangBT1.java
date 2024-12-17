package Mang;

import java.util.Scanner;

public class MangBT1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số phần tử của mảng : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println( " giá trị tại vị trí " + i);
            arr[i]=sc.nextInt();
        }
        MangBT1 mangBT1 = new MangBT1();
        mangBT1.getDuyet1Lan(arr);
    }
    public void getDuyet1Lan(int[] arr){
        int[] mangTam = new int[1000000];
        for(int i=0;i<arr.length;i++){
            mangTam[arr[i]]++;
        }
        for(int i=0;i<mangTam.length;i++){
            if(mangTam[i]== 1){
                System.out.print(" " + i);
            }
        }
    }
}
