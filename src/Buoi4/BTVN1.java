package Buoi4;

import java.util.Scanner;

public class BTVN1 {
    static Scanner sc = new Scanner(System.in);
    static         StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println(" Nhập vào chuỗi cần kiểm tra ");
        // đọc dữ  liệu và gán vào biến 
        String str = sc.nextLine();
        demSoLanXuatHienCuaTu(str);
        System.out.println("Chuỗi sau khi in hoa là ");
        System.out.println(chuyenDoi(str));
        xoaNguyenAm(str);
    }

    public static void hienThi(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }


    // kiểm tra số lần xuất hiện của 1 từ
    public static void demSoLanXuatHienCuaTu (String str) {
        int count = 0;
        // tách chuỗi thành các phần tử bằng nhau bằng phương thức split() của lớp string
        String[] parts = str.split(" ");
        System.out.println(" Nhập từ cần so sánh ");
        String tuCanSS = sc.nextLine();
        for(String part : parts) {
           // System.out.println(part);
            if(part.equalsIgnoreCase(tuCanSS)) {
                count++;
            }
        }
        System.out.println(tuCanSS+" xuất hiện "+count+ " lần ");
    }



    // chuyển đổi  chữ cái đầu tiên của mỗi từ thành in hoa
    public static String chuyenDoi(String arr) {
        // tách chuỗi thành các từ đơn
        String[] parts = arr.split(" ");
        for(int i = 0; i < parts.length; i++) {
            String item = parts[i];
            //trích chữ cái đầu của chuỗi item và viết hoa
            String chuyen = item.substring(0,1).toUpperCase();
            item=chuyen+item.substring(1).toLowerCase();
            // add các từ vào chuỗi ms
            sb.append(item).append(" ");
        }
        return sb.toString();

    }

    // xóa nguyên âm trong câu
    public static void xoaNguyenAm(String str) {
       String s1 = str.replaceAll("[aAeEiIoOuUyY]", "-");

        System.out.println(" Chuỗi sau khi xóa nguyên âm là ");
        System.out.println(s1);
    }
}
