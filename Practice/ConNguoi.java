package Practice;

import java.util.Scanner;

public class ConNguoi {
    public static String thanhPho;
    public static String huyen;
    public static String xa;
    private int tuoi;
    private String ten;
    private String gioiTinh;

    public ConNguoi(String ten,String gioiTinh){
        thanhPho = "Ha noi";
        huyen = "Dan phuong";
        xa = "Tan hoi";
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public void inThongTinCuaNguoiDan(){
        System.out.println(this.ten + " - " + this.gioiTinh + " - " + xa  + " - " + huyen + " - " + thanhPho);
    }

    public static void main(String[] args) {
        System.out.println("Chao mung den voi phan mem quan li dan cu");
        for(int i = 1; ;i++){
            System.out.println("Mang.Nhap ten va gioi tinh: ");
            Scanner scanner = new Scanner(System.in);
            String ten= scanner.nextLine();
            String gioiTinh= scanner.nextLine();
            ConNguoi conNguoi = new ConNguoi(ten,gioiTinh);
            conNguoi.inThongTinCuaNguoiDan();
        }
    }
}
