package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số a ");
        double a = sc.nextDouble();
        System.out.println(" Nhập số b ");
        double b = sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println(" Phương trình vô số nghiệm");
            } else{
            System.out.println(" Phương trình vô nghiệm ");
            }
        } else {
            double x = -b/a;
            System.out.println(" Nghiệm của phương trình là : " + x);
        }
    }
}
