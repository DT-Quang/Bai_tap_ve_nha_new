package Buoi2;

import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        BTVN1 btvn1 = new BTVN1();
        btvn1.xepLoai();
    }

    public void xepLoai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp tên sinh viên : ");
        String name = sc.nextLine();
        System.out.println(" Nhap diem chuyen can cua " + name);
        float diemChuyenCan = sc.nextFloat();
        System.out.println(" Nhap diem giua ky cua " + name);
        float diemGiuaKy = sc.nextFloat();
        System.out.println(" Nhap diem cuoi ky cua " + name);
        float diemCuoiKy = sc.nextFloat();
        double diemTrungBinh = (diemChuyenCan+diemGiuaKy+diemCuoiKy)/3;
        if(diemTrungBinh>=9){
            System.out.println(" A ");
        } else if(diemTrungBinh<9 && diemTrungBinh>=7){
            System.out.println(" B ");
        } else if(diemTrungBinh<7 && diemTrungBinh>=5){
            System.out.println(" C ");
        } else if(diemTrungBinh<5){
            System.out.println(" D ");
        }
    }
}
