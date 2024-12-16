package Buoi8.BaiTap;

public class Staff extends Employee{

    // trưởng phòng quản lý nếu có , ko thì để null
    public Manager truongPhong;

    public Staff(){
        // khởi tạo đối tượng cha
        super();
        // khởi tạo giá trị lương của nhân viên đều là 100
        super.setLuongMotNgay(100d);
    }

    @Override
    public double cachTinhLuongThang() {
        return super.getSoNgayLamViec()*super.getLuongMotNgay();
    }

    @Override
    public void nhapThongTin() {
        System.out.println(" Nhập thông tin nhân viên : ");
        super.nhapThongTin();
    }

    @Override
    public void hienThi() {
        System.out.println(" Hiển thị thông tin nhân viên : ");
        super.hienThi();
        if(truongPhong != null){
        System.out.println(" Thông tin quản lý : " + truongPhong.getMaNV() + " | "+ truongPhong.getHoTen());
        }
    }

    public Manager getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(Manager truongPhong) {
        this.truongPhong = truongPhong;
    }
}
