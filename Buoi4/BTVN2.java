package Buoi4;

import java.util.Scanner;

public class BTVN2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Nhập chuỗi cần kiểm tra ");
        String sdt = sc.nextLine();

        if(kiemTra(sdt))
            System.out.println(" Đây là số điện thoại");
        else
            System.out.println("Đây không phải số điện thoại");
    }

    public static boolean kiemTra(String sdt){
        // loại bỏ các kí tự đc phép dùng trong sdt như - hay .
        String newsdt = sdt.replaceAll("[- .]","");
        System.out.println(newsdt);
        // kiểm tra độ dài hợp lệ
        if (newsdt.length()==9){
            return true;
        } else if (newsdt.length()==10 && newsdt.startsWith("0")){
            return true;
        } else if (newsdt.length()==11 && newsdt.startsWith("84")){
            return true;
        } else if (newsdt.length()==12 && newsdt.startsWith("+84")){
            return true;
        }
        return false;
    }
}
