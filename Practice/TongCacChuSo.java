package Practice;

import java.util.Scanner;

public class TongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số cần tính : ");
        int n = sc.nextInt();
        int a,b;
        int sum=0;
        while(n!=0){
            a=n%10;
            sum+=a;
            b=n/10;
            n=b;
        }
        System.out.println(" Kết quả là : "+ sum);
    }
}
