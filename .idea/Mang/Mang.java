package Mang;

import java.util.Scanner;

public class Mang {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mang.Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length; i++) {
            System.out.println("Mang.Nhap cac gia tri cho phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        for(int i = n-1 ; i>=0; i--) {
            System.out.print(arr[i] + " , ");
        }
        //        for(int i = 0; i < n; i++) {
//            int dem=0;
//            for(int j = 1; j <= arr[i]; j++){
//                if(arr[i]%j == 0){
//                    dem++;
//                }
//            }
//            if(dem == 2){
//                System.out.print(arr[i] + "   ");
//            }
//        }
    }
}
