package Practice;

import java.util.Scanner;

public class Mapi_ixi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập n ");
        int n = sc.nextInt();
        int SoDauTien=1;
        for (int i = 1; i <= n; i++) {
            int j=i*i;
            if(SoDauTien==1){
                SoDauTien=0;
            } else{
                System.out.print(" , ");
            }
            System.out.print(i + ":" + j);
        }
    }
}
