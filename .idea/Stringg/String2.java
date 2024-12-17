package Stringg;

public class String2 {
    public static void main(String[] args) {

        // compareTo ( phân biệt hoa thường ) , compareToIgnoreCase( bỏ qua phân biệt hoa thường ) so sánh 2 chuỗi
        // trả về 0 nếu bằng nhau , <0 nếu nhỏ hơn và >0 neeys lớn hơn
        java.lang.String s1 = "abc123";
        java.lang.String s2 = "abc123";
        java.lang.String s3 = "Abc123";

        int x = s1.compareTo(s2);
        int x2 = s1.compareTo(s3);
        int x3 = s1.compareToIgnoreCase(s3);
        System.out.println("x="+x);
        System.out.println("x2="+x2);
        System.out.println("x3="+x3);

        // đảo ngược chuỗi
        // cần khai báo đối tượng thuôc class string builder
       StringBuilder s4 = new StringBuilder("abc123");
       s4.reverse();
        System.out.println(s4);


        // tách chuỗi split
        java.lang.String s5 = " hello , world ";
        java.lang.String [] mang = s5.split(",");
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }


        // toLowercase() && toUpperCase()
        java.lang.String s6 = " Tôi bắt đầu học lập trình  ";
        java.lang.String s7 =s6.toLowerCase(); // chuyển tất cả ký tự sang thường
        System.out.println(s7);
        java.lang.String s8 =s6.toUpperCase(); // chuyển sang ký tự in hoa
        System.out.println(s8);

        //toCharArray() tách chuỗi thành từng kí tự cho vào mảng
        java.lang.String s9 = " toiyeuem ";
        char[] mang2 = s9.toCharArray(); // chuỗi khai báo trong "" , kí tự khai báo trong ''

        for(int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }
    }
}
