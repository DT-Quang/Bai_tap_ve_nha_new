package Buoi8.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    // khởi tạo mặc định cho list
    private List<Staff> danhSachNhanVien = new ArrayList<>();

    public Manager() {
        super();
        super.setLuongMotNgay(200d);
    }

    @Override
    public double cachTinhLuongThang() {
        return super.getLuongMotNgay()*super.getSoNgayLamViec()+(100*danhSachNhanVien.size());
    }

    public List<Staff> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<Staff> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    @Override
    public void nhapThongTin() {
        System.out.println(" Nhập thông tin trưởng phòng : ");
        super.nhapThongTin();
    }

    @Override
    public void hienThi() {
        System.out.println(" Hiển thị thông tin trưởng phòng : ");
        super.hienThi();
        System.out.println("Danh sách nhân viên của quản lý ");
        for(Staff staff : danhSachNhanVien) {
            System.out.println(staff.getMaNV() + " ");
        }
        System.out.println();
    }
}
