package LessonContent;

import java.util.Scanner;

public class While {
    public static void main (String [] args){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while(x!=0){
            System.out.println("Mang.Nhap bat ki de tiep tuc ; Mang.Nhap 0 de thoat");
            x = sc.nextInt();
        }
    }
}
