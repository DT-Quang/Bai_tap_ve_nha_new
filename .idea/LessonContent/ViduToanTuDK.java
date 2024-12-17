package LessonContent;

import java.util.Scanner;

public class ViduToanTuDK {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mang.Nhap a : ");
        int a = sc.nextInt();
        String ketQua = (a%2==0)?" so chan ":" so le ";
        System.out.println(" a la " + ketQua);
    }
}
