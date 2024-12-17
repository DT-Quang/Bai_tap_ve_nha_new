package Buoi2;

import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        BTVN3 obj = new BTVN3();
        obj.tienDien();
    }
    public void tienDien(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so dien da dung trong thang ");
        double soDienDaDung = sc.nextDouble();
        System.out.println("Gia tien bac 1 ");
        double giaDienBac1 = sc.nextDouble();
        System.out.println("Gia tien bac 2 ");
        double giaDienBac2 = sc.nextDouble();
        System.out.println("Gia tien bac 3 ");
        double giaDienBac3 = sc.nextDouble();
        System.out.println("Gia tien bac 4 ");
        double giaDienBac4 = sc.nextDouble();
        System.out.println("Gia tien bac 5 ");
        double giaDienBac5 = sc.nextDouble();
        System.out.println("Gia tien bac 6 ");
        double giaDienBac6 = sc.nextDouble();
        double tongTienDien;
        if (soDienDaDung <= 0)
            System.out.println("Cat dien nha nay luon di");
        else if (soDienDaDung <= 50) {
            tongTienDien = soDienDaDung * giaDienBac1;
            System.out.println(" So tien dien can thu la " + tongTienDien);
        } else if (soDienDaDung <= 100) {
            tongTienDien = 50 * giaDienBac1 + (soDienDaDung - 50) * giaDienBac2;
            System.out.println(" So tien dien can thu la " + tongTienDien);
        } else if (soDienDaDung <= 200) {
            tongTienDien = 50 * giaDienBac1 + 50 * giaDienBac2 + (soDienDaDung - 100) * giaDienBac3;
            System.out.println(" So tien dien can thu la " + tongTienDien);
        } else if (soDienDaDung <= 300) {
            tongTienDien = 50 * giaDienBac1 + 50 * giaDienBac2 + 100 * giaDienBac3 +
                    (soDienDaDung - 200) * giaDienBac4;
            System.out.println(" So tien dien can thu la " + tongTienDien);
        } else if (soDienDaDung <= 400) {
            tongTienDien = 50 * giaDienBac1 + 50 * giaDienBac2 + 100 * giaDienBac3 +
                    100 * giaDienBac4 + (soDienDaDung - 300) * giaDienBac5;
            System.out.println(" So tien dien can thu la " + tongTienDien);
        } else {
            tongTienDien = 50 * giaDienBac1 + 50 * giaDienBac2 + 100 * giaDienBac3 +
                    100 * giaDienBac4 + 100 * giaDienBac5 + (soDienDaDung - 400) * giaDienBac6;
            System.out.println(" So tien dien can thu la " + tongTienDien);
        }
    }
}
