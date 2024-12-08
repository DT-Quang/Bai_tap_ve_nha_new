package Mang;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SapXep {
//    public static int[] reverse(int[] x){
//        int [] rs= new int[x.length];
//        int index=0;
//        for(int i=x.length-1;i>=0;i--){
//            rs[index]=x[i];
//            index++;
//        }
//        return rs;
//    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Mang.Nhap a ");
        int a = sc.nextInt();
        System.out.println("Mang.Nhap b ");
        int b = sc.nextInt();
        System.out.println("Mang.Nhap c ");
        int c = sc.nextInt();
        Integer []numbers = {a,b,c};
        System.out.println(" Vị trí chưa sắp xếp : " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
//        Arrays.sort(numbers);
//        numbers = Mang.SapXep.reverse(numbers);
        System.out.println(" Vị trí đã sắp xếp : " + Arrays.toString(numbers));
    }
}
