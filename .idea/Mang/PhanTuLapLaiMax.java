package Mang;

import java.util.Scanner;

public class PhanTuLapLaiMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" giá trị phần tử tại vị trí " + i);
            arr[i] = sc.nextInt();
        }
        PhanTuLapLaiMax mangBt8 = new PhanTuLapLaiMax();
//        mangBt8.getChanLe(arr);
//        mangBt8.getSapXep(arr);
        mangBt8.getDuyet(arr);
    }
    public void getChanLe(int[] arr){
        String chan= " Các số chẵn trong mảng là : ";
        String le= " Các số lẻ trong mảng là : ";
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0)
                chan+=arr[i]+" ";
             else
                le+=arr[i]+" ";
        }
        System.out.println(chan);
        System.out.println(le);
    }
    public void getSapXep(int[] arr){
        String tangDan= " Mảng được sắp xếp theo thứ tự tăng dần là : ";
        String giamDan= " Mảng được sắp xếp theo thứ tự giảm dần là : ";
        int brr;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    brr=arr[i];
                    arr[i]=arr[j];
                    arr[j]=brr;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            tangDan+=arr[i]+" ";
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    brr=arr[i];
                    arr[i]=arr[j];
                    arr[j]=brr;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            giamDan+=arr[i]+" ";
        }
        System.out.println(giamDan);
        System.out.println(tangDan);
    }
    public void getDuyet(int[] arr){
        String pTxhnn= " Các phần tử được lặp lại nhiều nhất là : ";
        int maxDuyet=0;
        int pTXHNN=arr[0];
        // B1  tim max
        for(int i = 0; i < arr.length; i++){
            int dem=0;
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dem++;
                }
            }
            if(maxDuyet<dem){
                maxDuyet=dem;
            //    pTXHNN=arr[i];
//                 pTxhnn+=arr[i];
            }
//            for(int i = 0; i < arr.length; i++){
//                if(maxDuyet==dem)
//                    pTxhnn+=pTXHNN;
//        }
        }

        // B2 duyet max
        String result = "";
        for(int i = 0; i < arr.length; i++){
            int dem2=0;
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dem2++;
                }
            }
            if(maxDuyet==dem2 && !result.contains("- " + arr[i] + " -")) {
                result += "- " + arr[i] + " -";
            }
        }
        System.out.println(result);

        //        System.out.println(" Các phần tử được lặp lại nhiều nhất là : " + pTXHNN);
    }
}
