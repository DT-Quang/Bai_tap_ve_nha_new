package LessonContent;

import java.util.Scanner;

public class ViDu {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mang.Nhap a");
        int a = scanner.nextInt();
        System.out.println("Mang.Nhap b");
        int b = scanner.nextInt();
        System.out.println(a + " == " + b + " : " + (a==b));
        System.out.println(" " + a + " != " + b + " : " + (a!=b));
        System.out.println(" " + a + " < " + b + " : " + (a<b));
        System.out.println(" " + a + " > " + b + " : " + (a>b));
        System.out.println(" --------- ");
        System.out.println(" Ca 2 la so chan : " + (a%2==0 && b%2==0));
        System.out.println(" Co 1 so la so chan : " + (a%2==0 || b%2==0));
    }
}
