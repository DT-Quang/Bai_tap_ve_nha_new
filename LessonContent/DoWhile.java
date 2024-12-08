package LessonContent;

import java.util.Scanner;

public class DoWhile {
    public static void main (String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mang.Nhap n>0");
            n = sc.nextInt();
        } while (n<=0);
    }
}
