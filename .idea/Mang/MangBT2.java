package Mang;

import java.util.Scanner;

public class MangBT2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap số phần tử trong mảng : ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0; i<n;i++){
            System.out.println(" Nhập giá trị cho phần tử tại vị trí " + i);
            arr[i]= sc.nextInt();
        }
        MangBT2 mangBT2= new MangBT2();
        mangBT2.getDuyet2Lan(arr);
    }
    public void getDuyet2Lan(int[] arr){
        int[] mangTam=new int[1000000];
        for(int i =0; i<arr.length;i++){
            mangTam[arr[i]]++;
        }
        for(int i =0 ; i<mangTam.length;i++){
            if(mangTam[i]==2){
                System.out.print(" " + i);
            }
        }
    }
}
