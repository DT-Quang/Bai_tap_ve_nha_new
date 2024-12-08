package Practice;

import java.util.Scanner;

public class SoNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập n ");
        int n = sc.nextInt();
        String nhiPhan = "";
        while(n>0){
            nhiPhan=(n%2)+nhiPhan;
            n/=2;
        }
        System.out.println(nhiPhan);
    }
}
