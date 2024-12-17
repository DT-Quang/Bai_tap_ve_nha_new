package Practice;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập số a : ");
        double a = sc.nextDouble();
        System.out.print(" Nhập số b : ");
        double b = sc.nextDouble();
        System.out.print(" Nhập số c : ");
        double c = sc.nextDouble();
        double d,x1,x2;
        d=Math.pow(b,2)-(4*a*c);
        if(a==0){
            System.out.println(" Phương trình sai . ");
        }else {
            if(d<0){
                System.out.println(" Phương trình vô nghiệm . ");
            } else if (d==0){
                x1=-b/(2*a);
                System.out.println(" Phương trình có nghiệm kép "+ x1);
            } else{
                x1=(-b + Math.sqrt(d))/(2*a);
                x2=(-b - Math.sqrt(d))/(2*a);
                System.out.println(" Phương trình có 2 nghiệm là : ");
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
        }
        Muon();
    }
    public static void Muon(){
        System.out.println("Đoạn mã dùng lại.");
    }
}
