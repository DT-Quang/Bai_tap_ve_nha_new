package Buoi2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double luongTheoGio = 50000;
        double soGioCoBan = 40 ;
        double heSo=1.5;
        System.out.println(" Nhập số giờ làm của nhân viên ");
        double soGioLam = sc.nextDouble();
        double luong = 0;
        if(soGioLam>soGioCoBan)
            luong = (soGioLam-soGioCoBan)*(luongTheoGio*heSo)
                    +soGioCoBan*luongTheoGio;
        else
            luong = soGioLam*luongTheoGio;

        System.out.println(luong);
    }
}
