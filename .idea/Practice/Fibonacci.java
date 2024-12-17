package Practice;

import java.util.Scanner;

public class Fibonacci {
//    cách 1 tính thủ công
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        String fibonacci = "Dãy số fibonacci cần in là : ";
//        System.out.println(" Nhập số phần tử cho dãy số : ");
//        int n = sc.nextInt();
//        int f0=0,f1=1,fn;
//        for(int i=0;i<n;i++){
//           if(i<2){
//               System.out.print(i+" ");
//           } else {
//               fn=f0+f1;
//               f0=f1;
//               f1=fn;
//               System.out.print(fn+" ");
//           }
//        }
//    }

    //    cách 2 sử dụng đệ quy
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số nguyên dương n  ");
        int n = sc.nextInt();
        int result=fibonacci(n);
        System.out.println(" Số thứ " + n + " trong dãy fabonacci là : " + result);

    }
    public static int fibonacci(int n) {
        if(n<2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
