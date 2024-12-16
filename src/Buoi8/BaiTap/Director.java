package Buoi8.BaiTap;

import java.util.Scanner;

public class Director extends Employee {

    private Double coPhan ;

    public Double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(Double coPhan) {
        this.coPhan = coPhan;
    }

    public Director() {
        super();
        super.setLuongMotNgay(300d);
    }

    @Override
    public void nhapThongTin() {
        System.out.println(" Nhập thông tin giám đốc : ");
        System.out.println(" Nhập số cổ phần đang nắm giữ (theo % , không vượt quá 100%) ");
        boolean khongHopLe = true;
        do {
            this.coPhan= new Scanner(System.in).nextDouble();
            if(this.coPhan>0 && this.coPhan<=100){
                khongHopLe = false;
            }else {
                System.out.println(" Nhập thông tin cổ phần không đúng , đề nghị nhập lại ");
            }
        } while (khongHopLe);
        super.nhapThongTin();
    }

    @Override
    public void hienThi() {
        System.out.println(" Hiển thị thông tin giám đốc : ");
        super.hienThi();
    }


    @Override
    public double cachTinhLuongThang() {
        return super.getLuongMotNgay()*super.getSoNgayLamViec();
    }


}
