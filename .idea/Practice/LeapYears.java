package Practice;

import java.util.Scanner;

public class LeapYears {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mang.Nhap nam can kiem tra : ");
        int n = sc.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
