package Buoi4;

import java.util.Scanner;

public class BTVN3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Nhập số phần tử của mảng ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Nhập giá trị tại vị trí " + i + " : ");
            arr[i] = sc.nextInt();
        }
        hienThi(arr);
        System.out.println();
        sumChanLe(arr);
        System.out.println();
        soNguyenTo(arr);
        System.out.println();
        sxChanLe(arr);
        System.out.println();
        chiaMang(arr);
        System.out.println();
        getDuyet(arr);
        System.out.println();
        getChen(arr);
        System.out.println();
        getXoaPT(arr);
    }

    public static void hienThi(int[] arr) {
        System.out.print("Mảng : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sumChanLe(int[] arr) {
        int sumChan = 0;
        int sumLe = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumChan += arr[i];
            }
            if (arr[i] % 2 != 0) {
                sumLe += arr[i];
            }
        }
        System.out.println(" Tổng các số chẵn trong mảng là " + sumChan);
        System.out.println(" Tổng các số lẻ trong mảng là " + sumLe);
    }

    public static void soNguyenTo(int[] arr) {
        int cout = 0;
        for (int m : arr) {
            cout = 0;
            for (int i = 1; i <= m; i++) {
                if (m % i == 0) {
                    cout++;
                }

            }
            if (cout == 2)
                System.out.println(m + " là số nguyên tố ");
            else
                System.out.println(m + " không là số nguyên tố ");

        }
    }

    public static void sxChanLe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 == 0) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        hienThi(arr);
    }

    public static void chiaMang(int[] arr) {
        String mangTam1 = "";
        String mangTam2 = "";
        int sum = 0;
        double tbc;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        tbc = (double) sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= tbc)
                mangTam1 += arr[i] + " ";
            else
                mangTam2 += arr[i] + " ";
        }
        System.out.println(mangTam1);
        System.out.println(mangTam2);
    }

    public static void getDuyet(int[] arr) {
        boolean[] kiemTra = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!kiemTra[i]) {
                int cout = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        cout++;
                        kiemTra[j] = true;
                    }
                }
                if (cout > 1)
                    System.out.println(" Phần tử " + arr[i] + " được lặp lại " + cout + " lần ");
            }
        }
    }

    public static void getChen(int[] arr){
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

    public static void getXoaPT(int[] arr){
        System.out.println(" Nhập phần tử cần xóa ");
        int x = sc.nextInt();

        int digit = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
                digit=i;
        }
        int[] newArr = new int[arr.length-1];

        if (digit == -1){
            System.out.println(" Phần tử cần xóa không nằm trong mảng ");
            hienThi(arr);
        } else {
            for(int i=0;i<digit;i++){
                newArr[i]=arr[i];
            }
            for(int i = digit+1;i<arr.length;i++){
                newArr[i-1]=arr[i];
                System.out.println(" Mảng sau khi xóa " + x + " là ");
                hienThi(newArr);
            }
        }

    }
}
