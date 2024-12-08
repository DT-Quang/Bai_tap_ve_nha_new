package Buoi2;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args){
        BTVN2 obj = new BTVN2();
        obj.tamGiac();
    }
    public void tamGiac (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap 3 canh can kiem tra  ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a<=0) && (b<=0) && (c<=0) || (a+b<=c|| a+c<=b || b+c<=a)){
            System.out.println(" Day khong phai 3 canh cua tam giac ");
        }
        if (a+b>c && a+c>b && b+c>a) {
            if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b){
                System.out.println(" Day la tam giac vuong ");
            } else if (a==b && b==c) {
                System.out.println(" Day la tam giac deu ");
            } else if (a==b || b==c || c==a ) {
                System.out.println(" Day la tam giac can ");
            } else if (a*a>b*b+c*c || b*b>a*a+c*c || c*c>a*a+b*b) {
                System.out.println(" Day la tam giac tu ");
            } else {
                System.out.println(" Day la tam giac nhon ");
            }
        }
    }
}
