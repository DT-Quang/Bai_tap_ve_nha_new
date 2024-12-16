package Buoi8.BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        int type = 0;
        do {
            System.out.println(" Nhập các chức năng ");
            System.out.println(" 1 : Nhập thông tin công ty ");
            System.out.println(" 2 : Phân bổ nhân viên ");
            System.out.println(" 3 : Thêm nhân sự ");
            System.out.println(" 4 : Xóa nhân sự ");
            System.out.println(" 5 : Hiển thị ");
            System.out.println(" 6 : Hiển thị nhân viên có mức lương cao nhất ");
            System.out.println(" 7 : Hiển thị trưởng phòng có nhiều nhân viên nhất ");
            System.out.println(" 8 : Sắp xếp nhân viên theo thứ tự alphabet ");
            System.out.println(" 9 : Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần ");
            System.out.println(" 10 : Hiển thị giám đốc có cổ phần nhiều nhất ");
            System.out.println(" 11 : Hiển thị thu nhập của từng giám đốc ");
            System.out.println(" 12 : Thoát ");
            type = new Scanner(System.in).nextInt();
            switch (type) {

                case 1:
                    company.nhapThongTinCongTy();
                    break;
                case 2:
                    company.phanBoNhanVienVaoPhong();
                    break;
                case 3:
                    company.themNhanSu();
                    break;
                case 4:
                    company.xoaNhanSu();
                    break;
                case 5:
                    company.hienThiToanBoNhanVien();
                    break;
                case 6:
                    company.nhanVienThuNhapCaoNhat();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    System.out.println(" Thoát chương trình ");
                    break;
            }
        } while (type != 12);
    }
}
