package Mang;

import java.util.Scanner;

public class SoPTLapLai2Lan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số phần tử trong mảng là : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Giá trị tại vị trí " + i + " là : ");
            arr[i] = sc.nextInt();
        }
//        // Cach 1
//        for (int i = 0; i < n; i++) {
//            int dem = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    dem++;
//                }
//                if(dem==2 && i==j){
//                    dem=0;
//                    break;
//                }
//            }
//            if (dem == 2) {
//                System.out.print(arr[i] + " ");
//            }
//        }
        SoPTLapLai2Lan mangBt7 = new SoPTLapLai2Lan();
        mangBt7.duyet2Lan(arr);
    }

    public void duyet2Lan(int[] arr){
        int[] mangTam = new int[1000000];
        for(int i=0;i<arr.length;i++){
            mangTam[arr[i]]++;
        }
        for(int i=0;i<mangTam.length;i++){
            if(mangTam[i]== 2){
                System.out.println(" " + i);
            }
        }
    }
}

