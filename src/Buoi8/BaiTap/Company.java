package Buoi8.BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {


    private String tenCongTy;
    private String maSoThue;
    private Double doanhThuThang;

    private List<Employee> danhSachNhanVien = new ArrayList<>();

    public void nhapThongTinCongTy() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tên công ty ");
        this.tenCongTy = sc.nextLine();
        System.out.println(" Nhập mã số thuế ");
        this.maSoThue = sc.nextLine();
        System.out.println(" Nhập doanh thu tháng ");
        this.doanhThuThang = sc.nextDouble();
    }

    public void truongPhongCoNhieuNhanVienNhat(){
        System.out.println(" Trưởng phòng có nhiều nhân viên nhất công ty là : ");
        int max=0;
        Manager manager = new Manager();
        int soLuongNVCuaTP=manager.getDanhSachNhanVien().size();
        for(Employee employee : danhSachNhanVien){
            if(employee instanceof Manager){

            }
        }
    }

    public void nhanVienThuNhapCaoNhat(){
        System.out.println();
        System.out.println(" Nhân viên có thu nhập cao nhất công ty là ");
        double max=0;
        String nvXuatSac="";
        for(Employee emp : danhSachNhanVien){
            if(emp instanceof Staff && emp.cachTinhLuongThang()>max){

                    max=emp.cachTinhLuongThang();
                    nvXuatSac=emp.getMaNV();
            }
        }
        System.out.println(" Nhân viên có lương cao nhất là " + nvXuatSac + " với mức lương "+ max);
    }

    public void hienThiToanBoNhanVien() {
        System.out.println();
        System.out.println("== Thông tin toàn bộ nhân viên công ty ==");
        int stt=1;
        for (Employee emp : danhSachNhanVien) {
            System.out.println("----------");
            System.out.println(stt++ + " : ");
            emp.hienThi();
            System.out.println("----------");
        }
        System.out.println();
        int tongLuongToanCTy =0;
        for (Employee emp : danhSachNhanVien) {
            tongLuongToanCTy+= emp.cachTinhLuongThang();
        }
        System.out.println(" Tổng lương cần cho tháng vừa rồi là " + tongLuongToanCTy);
    }

    public void themNhanSu() {
        System.out.println(" Thêm một nhân viên : ");
        Employee emp = chonLoaiNhanVien();
        if(emp == null) {
            return;
        }
        emp.nhapThongTin();
        danhSachNhanVien.add(emp);
    }

    private Employee chonLoaiNhanVien() {
        Employee emp = null;
        int choice = 0;

        System.out.println("Chọn chức vụ muốn thêm ");
        System.out.println("1 Giám đốc");
        System.out.println("2 Trưởng phòng");
        System.out.println("3 Nhân viên");
        System.out.println("4 Thoát chương trình");
        choice = new Scanner(System.in).nextInt();

        switch (choice) {
            case 1:
                emp = new Director();
                break;
            case 2:
                emp = new Manager();
                break;
            case 3:
                emp = new Staff();
                break;
            case 4:
                System.out.println(" Thoát ");
                break;
            default:
                System.out.println(" Không hợp lệ , đề nghị nhập lại  ");
                break;

        }
        return emp;
    }

    /*
  o	Xóa: Cho phép xóa nhân viên hoặc trưởng phòng khỏi hệ thống.
     	Khi xóa trưởng phòng, cần phải ngắt liên kết giữa trưởng phòng đó và các nhân viên dưới quyền của họ.
     	Các nhân viên bị xóa trưởng phòng cần phải cập nhật lại thông tin trưởng phòng (có thể để là null nếu không có trưởng phòng).
     giải:
     b1) Nhập vào mã nhân viên muốn xóa:
     b2) Tìm nhân viên muốn xóa
     b3) nếu tìm thấy nhân viên cần xóa tiếp tục kiểm tra các trường hợp
          nếu
               == giám đốc => sử dụng hàm remove để xóa
               == nhân viên => sử dụng hàm remove để xóa
               == quản lý => trước khi xóa trường phòng
                            b1: Tìm hết danh sách nhân viên đang trực thuốc trưởng phòng đó
                            b2: Set toàn bộ thuộc tính trường phòng của nhân đo == null
                                sử dụng method: setTruongPhong(null)
                                => để giải phóng nhân viên đó khỏi trưởng phòng đã bị xóa
     */
    public void xoaNhanSu(){
        //b1 nhập mã nhân viên muốn xóa
        System.out.println(" Nhập vào mã nhân viên ");
        String maNVXoa = new Scanner(System.in).nextLine();

        //b2 tìm kiếm
        Employee empDelete = timKiemNhanVienTheoMa(maNVXoa);
        if(empDelete == null) {
            System.out.println("Không tìm thấy nhân viên với mã đã nhập ");
            return;
        }

        //b3 xóa
        if(empDelete instanceof Director || empDelete instanceof Staff ) {
            this.danhSachNhanVien.remove(empDelete);
        } else if(empDelete instanceof Manager) {
            xoaTruongPhongKhoiNhanVien(maNVXoa);

            // nếu là instanceof Manager ==> ép kiểu biến empDelete thành đối tượng kiểu Manager
            this.danhSachNhanVien.remove(empDelete);

        }
        System.out.println(" Xóa nhân viên thành công ");
    }

    public void phanBoNhanVienVaoPhong(){
        System.out.println(" Nhập mã nhân viên muốn đưa vào cho quản lý ");
        String maNV = new Scanner(System.in).nextLine();
        //kiểm tra nhân viên có tồn tại trong danh sách nhân viên không , hoặc có tồn tại mã nv nhưng ko phải là nv
        Employee employee = timKiemNhanVienTheoMa(maNV);
        if(!(employee instanceof Staff) ) {
            System.out.println(" Không tồn tại nhân viên với mã " + maNV);
            return;
        }
        Staff staff = (Staff) employee; // ép kiểu employee --> staff
        // nhân viên đấy đã được đưa vào phòng nào chưa
        if(staff.getTruongPhong()!=null){
            System.out.println("Nhân viên mã "+maNV+ " đã được đưa vào cho trưởng phòng "+ staff.getTruongPhong().getMaNV());
            return;
        }
        System.out.println(" Nhập vào mã nhân viên của quản lý ");
        String maNVQuanLy = new Scanner(System.in).nextLine();
        Employee employeeManager = timKiemNhanVienTheoMa(maNVQuanLy);
        //kiểm tra có tồn tại quản lý trong danh sách nhân viên ko , hoặc có tồn tại mã nv nhưng ko phải là quản lý ko
        if(!(employeeManager instanceof Manager) ) {
            System.out.println(" Không tồn tại nhân viên với mã " + maNV);
            return;
        }

        Manager manager = (Manager) employeeManager;
        // set quản lý cho nhân viên
        staff.setTruongPhong(manager);
        // thêm nv vvaofcho quản lý
        List<Staff> staffManager = manager.getDanhSachNhanVien();
        staffManager.add(staff);
    }

    private void xoaTruongPhongKhoiNhanVien(String maNVXoa) {
        // lấy danh sách nhân viên trong manager và set null director
        //b1 tìm danh sách nhân viên có manager cần xóa
        for(Employee emp : this.danhSachNhanVien) {
            // kiểm tra nêu ko phải nhân viên ==> bỏ qua
            if(emp instanceof Director || emp instanceof Manager) {
                continue;
            }
            // nếu la nvien kiem tra xem có thuoc ve truong phong do ko , ép kiểu về kiểu nhân viên
            Staff staff = (Staff) emp;
            if( staff.getTruongPhong() != null && staff.getTruongPhong().getMaNV().equalsIgnoreCase(maNVXoa) ) {
                staff.setTruongPhong(null);
            }
        }
    }

    public Employee timKiemNhanVienTheoMa(String maNV){  
        for (Employee emp : this.danhSachNhanVien) {
            if(maNV.equalsIgnoreCase(emp.getMaNV())) {
                return emp;
            }
        }
        return null;
    }

    public List<Employee> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<Employee> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public Double getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(Double doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }


}
