package Buoi8.BaiTap;

import java.util.Scanner;

public abstract class Employee {

    private String maNV;
    private String hoTen;
    private String sdt;
    private Integer soNgayLamViec;
    private Double luongMotNgay;

    public abstract double cachTinhLuongThang();

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập mã nhân viên ");
        this.maNV = sc.nextLine();
        System.out.println(" Nhập họ tên nhân viên ");
        this.hoTen = sc.nextLine();
        System.out.println(" Nhập số điện thoại nhân viên ");
        this.sdt = sc.nextLine();
        System.out.println(" Nhập số ngày làm việc trong tháng ");
        this.soNgayLamViec = sc.nextInt();
//        System.out.println(" Nhập lương 1 ngày của nhân viên ");
//        this.luongMotNgay = sc.nextDouble();

    }

    public void hienThi(){
        System.out.println(" Mã nhân viên " + maNV);
        System.out.println(" Họ tên nhân viên " + hoTen);
        System.out.println(" SĐT nhân viên " + sdt);
        System.out.println(" Số ngày làm việc của nhân viên " + soNgayLamViec);
//        System.out.println(" Lương một ngày của nhân viên " + luongMotNgay);
        System.out.println(" Lương tháng " + cachTinhLuongThang());
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(Integer soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public Double getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(Double luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }
}
