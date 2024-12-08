package Practice;

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số cần tính giai thừa :");
        int n = sc.nextInt();
//        int m=1;
//        for(int i=1;i<=n;i++){
//            m=m*i;
//        }
//        System.out.println();
        System.out.println("Giai thừa của "+n+" là : " +fact(n));
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}
