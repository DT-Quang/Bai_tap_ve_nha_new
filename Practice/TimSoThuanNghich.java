package Practice;

import java.util.Scanner;

public class TimSoThuanNghich {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        int a,b,c;
        for(;n!=0;) {
            a=n%10;
            n/=10;
            b=n%10;
            n/=10;
            c=n%10;
            n/=10;
            if(a==c){
                System.out.println("day la so thuan nghich");
            }
            else{
                System.out.println("day khong phai la so thuan nghich");
            }
        }
    }
}
