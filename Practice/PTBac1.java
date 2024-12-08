package Practice;

import java.util.Scanner;

public class PTBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a : ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị của b : ");
        double b = sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b/a;
            System.out.println(" Nghiệm của phương trình là : " + x );
        }
        Muon();
    }
    public static void Muon(){
        System.out.println("Đoạn mã dùng lại.");
    }
}
