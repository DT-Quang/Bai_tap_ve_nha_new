package Mang;

import java.util.Scanner;

public class MangBT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Giá trị của phần tử tại vị trí " + i);
            arr[i] = sc.nextInt();
        }
        MangBT3 mangBT3 = new MangBT3();
        mangBT3.getDuyetTPT(arr);
    }
    public void getDuyetTPT(int[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int dem=0;
            int max=0;
            for (int j = 0 ; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
            if(max<dem){
                max=dem;
            }
            if(!result.contains("- " + arr[i] + " -")){
                result += "- " + arr[i] + " -";
                System.out.println(result);
                System.out.println(" Giá trị phần tử " + arr[i] + " được lặp lại " + max + " lần ");
            }

        }
    }
}
