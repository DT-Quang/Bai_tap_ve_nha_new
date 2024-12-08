package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class MangBT6 {
   public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float [] a = null;
        float [] b = null;
        float [] c = null;

        System.out.println(" Nhập mảng a : ");
        a=input(a);
        System.out.println(" Nhập mảng b : ");
        b=input(b);

        c=tron2Mang(a,b);
        show(c);
    }
    public static float[] input(float[] arr) {
        System.out.println(" Nhập số phần tử của mảng : ");
        int n = sc.nextInt();
        arr=new float[n];
        for(int i=0; i<n; i++) {
            System.out.println("a["+i+"] : " );
            arr[i]=sc.nextFloat();
        }
        return arr;
    }
    public static void getXS(float[] arr) {
        float o=arr[0];
        for(int i=1; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    o=arr[i];
                    arr[i]=arr[j];
                    arr[j]=o;
                }
            }
        }
    }
    public static float[] tron2Mang(float[] a , float[] b) {
        int ai=a.length-1;
        int bi=b.length-1;
        int ci=a.length+b.length-1;
        float[] c = new float[ci+1];

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=ci;i>-1;i--){
            if (ai > -1 && bi > -1) {
                if (a[ai] > b[bi]) {
                    c[i] = a[ai--];
                } else {
                    c[i] = b[bi--];
                }
            } else if (bi == -1) {
                c[i] = a[ai--];
            } else if (ai == -1) {
                c[i] = b[bi--];
            }
        }
        return c;
    }
    public static void show(float[] arr) {
        System.out.println("Mảng sau khi trộn là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
