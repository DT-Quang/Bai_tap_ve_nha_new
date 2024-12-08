package Practice;

import java.util.Scanner;

public class ThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n ");
        int n = sc.nextInt();
        int i=2;
        if(n==1){
            System.out.println(n + " = " + n );
        } else{
            System.out.print(n + " = ");
            while(n!=1){
                if(n%i==0){
                    System.out.print(i+ " x ");
                    n/=i;
                } else{
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
