package LessonContent;

import java.util.Scanner;

public class Char_Java {
    public static void main(String[] args) {
        // khởi tạo , sd kí tự hoặc số tương ứng vs kí tự trong bảng ASII
        char ch = 'a'; // để kí tự trong dấu ngoặc kép
        char ch2 = 65;
        System.out.println(ch);
        System.out.println(ch2);

        //khai báo chưa gán giá trị
        char ch3;

        // lấy char từ dữ liệu nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        java.lang.String s = sc.nextLine();
        char ch4 = s.charAt(0); // lấy ra kí tự ở vị trí trong() giống trong mảng
        System.out.println(ch4);

//        so sánh 2 kí tự trả về số nguyên , dựa trên vị trí trên bảng ASII
        System.out.println(Character.compare(ch, ch4)); // lấy gtri số trc trừ số sau


        // áp dụng khi kiểm tra mật khẩu
        char ch5 ='1';
        char ch6 ='a';
        char ch7 ='A';
        char ch8 =' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));
    }
}
